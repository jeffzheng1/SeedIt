package aurora.seedit.utils;

/**
 * Created by JeffZheng on 3/23/15.
 */

import android.app.Application;

import com.parse.Parse;

public class SeeditApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this,
                "your_keys",
                "your_keys");
    }
}

