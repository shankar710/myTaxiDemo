package com.mytaxi.android_demo;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.RootMatchers;
import android.support.test.rule.ActivityTestRule;

import com.mytaxi.android_demo.activities.MainActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class HomeActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mHomeActivity = new ActivityTestRule<MainActivity>(MainActivity.class);

    private String driverName = "Sarah Scott";

    @Before
    public void setUp() {
    }

    @Test
    public void searchingDriverTest() throws InterruptedException {

        Espresso.onView(withId(R.id.textSearch)).perform(typeText("sa"));
        Thread.sleep(10000);
        Espresso.onView(withText(driverName)).inRoot(RootMatchers.isPlatformPopup()).perform(click());
        // ViewInteraction callBtn=Espresso.onView(Matchers.allOf(withId(R.id.fab),))
        Espresso.onView(withId(R.id.fab)).perform(click());
    }

    @After
    public void tearDown() throws  Exception {

    }
}