package com.kbz.hms.readerapp.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.kbz.hms.readerapp.R;
import com.kbz.hms.readerapp.adapters.NewBookAdapter;

import fragments.FeatureFragment;
import fragments.PopularFragment;

public class MainActivity extends AppCompatActivity {



   private DrawerLayout drawerLayout;
   private NavigationView navigationView;
   private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        drawerLayout = findViewById(R.id.dl_user_login);
        navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.menu_setting :
                        Toast.makeText(getApplicationContext(), "Setting", Toast.LENGTH_SHORT ).show();
                        break;

                    case R.id.menu_contactUS :
                        Toast.makeText(getApplicationContext(), "Contact Us", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.menu_help :
                        Toast.makeText(getApplicationContext(), "Help", Toast.LENGTH_SHORT).show();
                        break;
                }

                for(int i = 0; i < navigationView.getMenu().size(); i++ ){
                    navigationView.getMenu().getItem(i).setChecked(false);
                }
                menuItem.setChecked(true);
                drawerLayout.closeDrawer(Gravity.START);

                return true;
            }
        });


        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_feature, FeatureFragment.newInstance())
                .commit();


        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_popular, PopularFragment.newInstance())
                .commit();



        recyclerView = findViewById(R.id.rv_newBook);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        NewBookAdapter newBookAdapter = new NewBookAdapter();
        recyclerView.setAdapter(newBookAdapter);


    }



/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    */
}
