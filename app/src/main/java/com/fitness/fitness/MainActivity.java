package com.fitness.fitness;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.fitness.fitness.Adapters.MainPlansAdapter;
import com.fitness.fitness.ExerciseData.PlanData;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerViewOnGoingPlan,mRecyclerViewBeginner,mRecyclerViewIntermediate,mRecyclerViewAdvance;

    private ActionBarDrawerToggle actionBarDrawerToggle;
    private AppBarConfiguration mAppBarConfiguration;
    AppBarLayout appBarLayout;
    TextView mTitle;


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Toolbar toolbar = findViewById(R.id.toolbar);
        /*Spannable spannable = new SpannableString("Fitness");
        spannable.setSpan(new ForegroundColorSpan(getColor(R.color.darkRed)),0,2,6);
        toolbar.setTitle(spannable);*/

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        mTitle = findViewById(R.id.title_in_main);
        appBarLayout = findViewById(R.id.appbar_layout_pre_exercise);
        mRecyclerViewOnGoingPlan = findViewById(R.id.recyclerview_special_plan);
        mRecyclerViewBeginner = findViewById(R.id.recyclerview_beginner_plan);
        mRecyclerViewIntermediate = findViewById(R.id.recyclerview_intermediate_plan);
        mRecyclerViewAdvance = findViewById(R.id.recyclerview_advance_plan);

        final DrawerLayout drawer = findViewById(R.id.drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawer,R.string.Open, R.string.Close);

        drawer.addDrawerListener(actionBarDrawerToggle);

        actionBarDrawerToggle.setHomeAsUpIndicator(R.drawable.ic_menu_camera);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.setToolbarNavigationClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer(Gravity.LEFT);
            }
        });

        final NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                int id = menuItem.getItemId();
                switch (id)
                {
                    case R.id.nav_home:
                        Intent intent = new Intent(MainActivity.this,WorkoutHistory.class);
                        navigationView.getMenu().getItem(0).setCheckable(false);
                        drawer.closeDrawer(Gravity.LEFT);
                        startActivity(intent);
                }

                return true;
            }
        });
        RecyclerViewOperation();
        /*mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery)
                .setDrawerLayout(drawer)
                .build();*/
        /*NavController navController = Navigation.findNavController(this, getSupportFragmentManager().getFragments());
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController); */
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                if(Math.abs(i)-appBarLayout.getTotalScrollRange()==0)
                {
                    appBarLayout.setBackgroundColor(getColor(R.color.darkOrange));
                    mTitle.setTextColor(getColor(R.color.orange));

                }
                else
                {
                    appBarLayout.setBackgroundColor(getColor(R.color.orange));
                    mTitle.setTextColor(getColor(R.color.darkRed));
                }
            }
        });


    }

    private void RecyclerViewOperation() {
        mRecyclerViewOnGoingPlan.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        mRecyclerViewBeginner.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        mRecyclerViewIntermediate.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        mRecyclerViewAdvance.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        PlanData planData = new PlanData(this);
        MainPlansAdapter mOngoingPlanAdapter = new MainPlansAdapter(this, planData.OurPlan(),true);
        MainPlansAdapter mBeginnerPlanAdapter = new MainPlansAdapter(this,planData.BeginnerPlan(),false);
        MainPlansAdapter mIntermediatePlanAdapter = new MainPlansAdapter(this,planData.IntermediatePlan(),false);
        MainPlansAdapter mAdvancePlanAdapter = new MainPlansAdapter(this,planData.AdvancePlan(),false);

        mRecyclerViewOnGoingPlan.setAdapter(mOngoingPlanAdapter);
        mRecyclerViewBeginner.setAdapter(mBeginnerPlanAdapter);
        mRecyclerViewIntermediate.setAdapter(mIntermediatePlanAdapter);
        mRecyclerViewAdvance.setAdapter(mAdvancePlanAdapter);


    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        actionBarDrawerToggle.syncState();
    }
}