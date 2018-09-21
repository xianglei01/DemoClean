/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.lei.clean.data.repository;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.lei.clean.domain.model.Demo;
import com.lei.clean.domain.repository.PreferenceRepository;

import javax.inject.Inject;

/**
 * @author xianglei
 * @created 2018/7/10 12:22
 */
public class PreferenceImplRepository implements PreferenceRepository {

    private static final String PRE_FILE = "pre_demo";
    private static final String PREFERENCE_KEY_DEMO = "demo";

    private SharedPreferences mPrefs;

    private Gson gson;

    @Inject
    public PreferenceImplRepository(Context context, Gson gson) {
        mPrefs = context.getSharedPreferences(PRE_FILE, Context.MODE_PRIVATE);
        this.gson = gson;
    }

    private void putString(String key, String value) {
        mPrefs.edit().putString(key, value).apply();
    }

    private String getString(String key, String def) {
        return mPrefs.getString(key, def);
    }

    private void putInt(String key, int value) {
        putString(key, String.valueOf(value));
    }

    private void putLong(String key, long value) {
        putString(key, String.valueOf(value));
    }

    private void putBoolean(String key, boolean value) {
        putString(key, String.valueOf(value));
    }

    private int getInt(String key) {
        try {
            return Integer.parseInt(getString(key, "0"));
        } catch (Exception e) {
            return 0;
        }
    }

    private Long getLong(String key, long def) {
        try {
            return Long.parseLong(getString(key, "0"));
        } catch (Exception e) {
            return def;
        }
    }

    private boolean getBoolean(String key, boolean def) {
        try {
            return Boolean.parseBoolean(getString(key, String.valueOf(def)));
        } catch (Exception e) {
            return def;
        }
    }

    public void remove(String key) {
        mPrefs.edit().remove(key).apply();
    }


    @Override
    public Demo getDemo() {
        String json = getString(PREFERENCE_KEY_DEMO, "");
        return TextUtils.isEmpty(json) ? null : gson.fromJson(json, Demo.class);
    }

    @Override
    public void setDemo(Demo demo) {
        if (demo == null) {
            remove(PREFERENCE_KEY_DEMO);
            return;
        }
        putString(PREFERENCE_KEY_DEMO, gson.toJson(demo));
    }
}
