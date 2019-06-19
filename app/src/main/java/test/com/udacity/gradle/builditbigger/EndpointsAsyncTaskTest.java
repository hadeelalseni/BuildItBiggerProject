package com.udacity.gradle.builditbigger;


import android.os.Bundle;

//import android.support.test.rule.ActivityTestRule;
//import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

//@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest extends AndroidTestCase {

    public class MyTest {
        String test = EndpointsAsyncTask.class.getName();
        @Rule
  //      public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

        @Test
        public void myTest(){
            EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
    //        endpointsAsyncTask.execute(MainActivity.class);
        }


        }

}

