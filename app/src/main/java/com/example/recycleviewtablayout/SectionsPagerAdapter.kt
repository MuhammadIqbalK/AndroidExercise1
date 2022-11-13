package com.example.recycleviewtablayout

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = BlankFragment1()
            1 -> fragment = lolFragment()
            2 -> fragment = BlankFragment2()


        }
        return fragment as Fragment
    }

    override fun getItemCount(): Int {
        return 3
    }
}