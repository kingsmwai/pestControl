package com.example.pestcontrolap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.webkit.WebView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView

class Navigationdrawer : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    lateinit var drawer:DrawerLayout
    lateinit var navview:NavigationView
    lateinit var toolbar: androidx.appcompat.widget.Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_drawer)

        toolbar=findViewById(R.id.toolbar)
        drawer=findViewById(R.id.drawerLayout)
        navview=findViewById(R.id.navview)

        toggle= ActionBarDrawerToggle(this,drawer,toolbar, R.string.open,R.string.close)
        drawer.addDrawerListener(toggle)
        toggle
        toggle.syncState()
        if (savedInstanceState==null)
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, Fragment())
                .commit()

        navview.setNavigationItemSelectedListener{
            when(it.itemId){
              R.id.Form->{
                    val intentFormActivity = Intent(this@Navigationdrawer,FormActivity::class.java)
                    startActivity(intentFormActivity)

                }
              R.id.Search -> {
                    val inteSearch = Intent(this@Navigationdrawer,webviewSearch::class.java)
                    startActivity(inteSearch)
                }
                R.id.Advert -> {
                    val intentPrevention = Intent(this@Navigationdrawer,webviewSearch::class.java)
                    startActivity(intentPrevention)
                }

            }
            true
        }

        }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)

}
}
