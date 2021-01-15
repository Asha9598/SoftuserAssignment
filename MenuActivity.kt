package com.asha.softuserassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.asha.softuserassignment.adapter.ViewPagerAdapter
import com.asha.softuserassignment.fragments.AboutUsFragment
import com.asha.softuserassignment.fragments.AddStudentFragment
import com.asha.softuserassignment.fragments.HomeFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MenuActivity : AppCompatActivity() {
    private lateinit var lstTitle: ArrayList<String>
    private lateinit var lstFragments: ArrayList<Fragment>
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        viewPager = findViewById(R.id.viewpager)
        tabLayout = findViewById(R.id.tablayout)

        MenuList()
        val adapter = ViewPagerAdapter(lstFragments, supportFragmentManager, lifecycle)
        viewPager.adapter = adapter
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = lstTitle[position]
        }.attach()
    }
    private  fun MenuList(){
        lstTitle = ArrayList()
        lstTitle.add("Home")
        lstTitle.add("Add Student")
        lstTitle.add("About Us")
        lstFragments = ArrayList<Fragment>()
        lstFragments.add(HomeFragment())
        lstFragments.add(AddStudentFragment())
        lstFragments.add(AboutUsFragment())
    }
}
