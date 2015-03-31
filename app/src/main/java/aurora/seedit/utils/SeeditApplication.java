package aurora.seedit.utils;

/**
 * Created by JeffZheng on 3/23/15.
 */

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class SeeditApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this,
                "ZKc458o6x7nw1ZBzfEOUNauGwS1GA8mj2AmOhQ6V",
                "AYFHMbESbR2zBElIYvYVFqY8sNgU1ZwwulSisUem");
    }
}

