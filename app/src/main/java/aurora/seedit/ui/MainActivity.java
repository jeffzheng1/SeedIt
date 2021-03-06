package aurora.seedit.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.util.SparseIntArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.parse.ParseUser;

import java.util.ArrayList;
import java.util.List;

import aurora.seedit.R;
import br.liveo.interfaces.NavigationLiveoListener;
import br.liveo.navigationliveo.NavigationLiveo;

public class MainActivity extends NavigationLiveo
        implements NavigationLiveoListener {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private boolean mIsDrawerCreated = false;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    public void onUserInformation() {
        ParseUser currentUser = ParseUser.getCurrentUser();
        if (currentUser == null) {
            navigateToLogin();
            return;
        }
        String username = currentUser.getUsername();
        this.mUserEmail.setText(username);
        this.mUserPhoto.setImageResource(R.drawable.plant101);
        this.mUserBackground.setImageResource(R.drawable.default_background);
    }

    @Override
    public void onInt(Bundle bundle) {
        this.setNavigationListener(this);

        ParseUser currentUser = ParseUser.getCurrentUser();
        if (currentUser == null) {
            navigateToLogin();
        }

        mIsDrawerCreated = false;

        //The subtitles for the navigation drawer
        List<String> mListNameItem = new ArrayList<>();
        mListNameItem.add(0, getString(R.string.title_dashboard));
        mListNameItem.add(1, getString(R.string.title_my_garden));
        mListNameItem.add(2, getString(R.string.title_tasks));
        mListNameItem.add(3, getString(R.string.title_seedit_store));
        mListNameItem.add(4, getString(R.string.title_seedit_online));
        mListNameItem.add(5, getString(R.string.title_friends));

        // icons list items
        List<Integer> mListIconItem = new ArrayList<>();
        mListIconItem.add(0, R.drawable.profile_icon);
        mListIconItem.add(1, R.drawable.plants_icon);
        mListIconItem.add(2, R.drawable.task_icon);
        mListIconItem.add(3, R.drawable.store_icon);
        mListIconItem.add(4, R.drawable.online_icon);
        mListIconItem.add(5, R.drawable.friends_icon);

        //{optional} - Among the names there is some subheader, you must indicate it here
        List<Integer> mListHeaderItem = new ArrayList<>();

        //{optional} - Among the names there is any item counter, you must indicate it (position) and the value here
        SparseIntArray mSparseCounterItem = new SparseIntArray(); //indicate all items that have a counter

        //If not please use the FooterDrawer use the setFooterVisible(boolean visible) method with value false
        this.setFooterInformationDrawer(R.string.settings,0);

        this.setNavigationAdapter(mListNameItem, mListIconItem, mListHeaderItem, mSparseCounterItem);
    }

    private void navigateToLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title_dashboard);
                break;
            case 2:
                mTitle = getString(R.string.title_my_garden);
                break;
            case 3:
                mTitle = getString(R.string.title_tasks);
                break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mIsDrawerCreated) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up health_icon, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch(id) {
            case R.id.action_logout:
                ParseUser.logOut();
                navigateToLogin();
                break;
            case R.id.menu_add:
                Intent intent = new Intent(this, AddPlantActivity.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClickNavigation(int position, int i2) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        switch (position) {
            case 0:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, MySeeditFragment.newInstance(position + 1))
                        .addToBackStack(null)
                        .commit();
                break;
            case 1:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, GardenFragment.newInstance(position + 1))
                        .addToBackStack(null)
                        .commit();
                break;
            case 2:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, TaskFragment.newInstance(position + 1))
                        .addToBackStack(null)
                        .commit();
                break;
            default:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, PlaceholderFragment.newInstance(position + 1))
                        .commit();
                break;
        }
    }

    @Override
    public void onPrepareOptionsMenuNavigation(Menu menu, int i, boolean b) {

    }

    @Override
    public void onClickFooterItemNavigation(View view) {

    }

    @Override
    public void onClickUserPhotoNavigation(View view) {

    }
}
