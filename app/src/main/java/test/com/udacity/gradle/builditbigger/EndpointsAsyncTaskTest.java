package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.test.ApplicationTestCase;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class EndpointsAsyncTaskTest extends ApplicationTestCase<Application> {

    CountDownLatch signal = null;
    public EndpointsAsyncTaskTest(){
        super(Application.class);
    }

    @Override
    protected void setUp() throws Exception {
        signal = new CountDownLatch(1);
    }

    @Override
    protected void tearDown() throws Exception {
        signal.countDown();
    }

 /*   public EndpointsAsyncTaskTest(Class<Application> applicationClass) {
        super(applicationClass);
    }*/

    public void myTest() throws InterruptedException, TimeoutException, ExecutionException {
        System.out.println("here ya test");
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute();
        String testingJoke = endpointsAsyncTask.get(25, TimeUnit.SECONDS);
        assertTrue(testingJoke.length() > 0);
    }
}

