package com.retech.testdemo;

import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityRule<MainActivity> main = new ActivityRule<>(MainActivity.class);
    @Test
    public void shouldBeAbleToRunScreen() {
        onView(ViewMatchers.withId(R.id.text)).check(ViewAssertions.matches(ViewMatchers.withText("Raja")));

    }

}