package com.example.muyhengsong.calculator;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withInputType;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.muyhengsong.calculator", appContext.getPackageName());
    }

    @Test
    public void checkFunction() {

        String INT_NUM1 = "12";
        String INT_NUM2 = "12";
        String RESULT = "24.0";
        onView(withId(R.id.txt_num1)).perform(typeText(INT_NUM1), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.txt_num2)).perform(typeText(INT_NUM2), ViewActions.closeSoftKeyboard());

        onView(withId(R.id.btn_sum)).perform(click());
        onView(withId(R.id.txt_show)).check(matches(withText(RESULT)));

        onView(withId(R.id.txt_num1)).perform(clearText());
        onView(withId(R.id.txt_num2)).perform(clearText());

        //check min
        String INT_NUM3 = "12";
        String INT_NUM4 = "2";
        String RESULT2 = "10.0";
        onView(withId(R.id.txt_num1)).perform(typeText(INT_NUM3), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.txt_num2)).perform(typeText(INT_NUM4), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.btn_min)).perform(click());
        onView(withId(R.id.txt_show)).check(matches(withText(RESULT2)));

        onView(withId(R.id.txt_num1)).perform(clearText());
        onView(withId(R.id.txt_num2)).perform(clearText());

        //check mul
        String INT_NUM5 = "12";
        String INT_NUM6 = "2";
        String RESULT3 = "24.0";
        onView(withId(R.id.txt_num1)).perform(typeText(INT_NUM5), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.txt_num2)).perform(typeText(INT_NUM6), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.btn_mul)).perform(click());
        onView(withId(R.id.txt_show)).check(matches(withText(RESULT)));

        onView(withId(R.id.txt_num1)).perform(clearText());
        onView(withId(R.id.txt_num2)).perform(clearText());

        //check div
        String INT_NUM7 = "12";
        String INT_NUM8 = "2";
        String RESULT4 = "6.0";
        onView(withId(R.id.txt_num1)).perform(typeText(INT_NUM7), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.txt_num2)).perform(typeText(INT_NUM8), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.btn_div)).perform(click());
        onView(withId(R.id.txt_show)).check(matches(withText(RESULT4)));

    }

}
