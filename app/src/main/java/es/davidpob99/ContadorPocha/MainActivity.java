package es.davidpob99.ContadorPocha;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener ,NavigationView.OnNavigationItemSelectedListener, TresFragment.OnFragmentInteractionListener, CuatroFragment.OnFragmentInteractionListener, CincoFragment.OnFragmentInteractionListener, SeisFragment.OnFragmentInteractionListener {

    Button btngithub;
    TextView txabout;
    ImageView imgabout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        btngithub = (Button)findViewById(R.id.buttongithub);
        txabout = (TextView) findViewById(R.id.textViewabout);
        imgabout = (ImageView)findViewById(R.id.imageViewabout);
        btngithub.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    public void invisible() {
        btngithub.setVisibility(View.GONE);
        txabout.setVisibility(View.GONE);
        imgabout.setVisibility(View.GONE);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Fragment fragment = null;
        Boolean FragmentoSeleccionado = false;

        if (id == R.id.nav_camera) {
            // Handle the camera action
            fragment = new TresFragment();
            FragmentoSeleccionado = true;
            invisible();

        } else if (id == R.id.nav_gallery) {

            fragment = new CuatroFragment();
            FragmentoSeleccionado = true;
            invisible();

        } else if (id == R.id.nav_slideshow) {

            fragment = new CincoFragment();
            FragmentoSeleccionado = true;
            invisible();

        } else if (id == R.id.nav_manage) {

            fragment = new SeisFragment();
            FragmentoSeleccionado = true;
            invisible();

        }

        if(FragmentoSeleccionado){
            getSupportFragmentManager().beginTransaction().replace(R.id.Contenedor, fragment).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttongithub:
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://github.com/davidpob99/ContadorPocha"));
                startActivity(browserIntent);
                break;
        }
    }
}
