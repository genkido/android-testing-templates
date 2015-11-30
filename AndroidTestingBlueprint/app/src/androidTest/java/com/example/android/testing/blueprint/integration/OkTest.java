/*
 * Copyright 2015, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.testing.blueprint.integration;

import android.content.Context;
import android.os.Bundle;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.MediumTest;

import com.example.android.testing.blueprint.R;
import com.example.android.testing.blueprint.androidlibrarymodule.AndroidLibraryModuleClass;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getTargetContext;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Android test to showcase the usage of an Android Library from the main app module.
 */
@RunWith(AndroidJUnit4.class)
public class OkTest {

    private Context mContext;

    /**
     * This test class showcases passing arguments from the command line to the instrumentation.
     * <p>
     * Every @Test will fail if the argument "argument1" has the value "make_test_fail". See README
     * for more information.
     *
     */
    @Before
    public void checkCustomArgument() {

    }

    @Before
    public void initTargetContext() {
        
    }

    @Test
    public void verifyResourceFromLibrary() {
        assert(true);
    }

    @Test
    public void verifyClassFromLibrary() {
        assert(true);
    }
}