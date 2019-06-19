import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.MainActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)

public class EndpointsAsyncTaskTestTest extends AndroidTestCase {

    @Test

    public void myTest() throws InterruptedException, ExecutionException, TimeoutException {
        MainActivity mainActivity = new MainActivity();
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(mainActivity);

    }


    /*@Before
    public void setUp() throws Exception {
    }
    @After
    public void tearDown() throws Exception {
    }*/
}