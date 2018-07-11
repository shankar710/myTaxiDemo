package com.mytaxi.android_demo;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;

import com.mytaxi.android_demo.activities.AuthenticationActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


public class VerifyLoginTest {

    @Rule
    public ActivityTestRule<AuthenticationActivity> mVerifyLoginActivity = new ActivityTestRule<AuthenticationActivity>(AuthenticationActivity.class);

    private String positiveUser = "crazydog335";
    private String positivePwd = "venture";
    private String negativeUser = "shankar";
    private String negativePwd = "testpwd";

    @Before
    public void setUp() {
    }

    @Test
    public void negativeLoginTest1() {
        Espresso.onView(withId(R.id.edt_username)).perform(typeText(negativeUser));
        Espresso.onView(withId(R.id.edt_password)).perform(typeText(negativePwd),closeSoftKeyboard());
        Espresso.onView(withId(R.id.btn_login)).perform(click());
    }

    @Test
    public void positiveLoginTest2() {
        Espresso.onView(withId(R.id.edt_username)).perform(typeText(positiveUser));
        Espresso.onView(withId(R.id.edt_password)).perform(typeText(positivePwd));
        Espresso.onView(withId(R.id.btn_login)).perform(click());


    }


    @After
    public void teardown() throws Exception {

    }

}
