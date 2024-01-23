package com.example.kotlinpatterns.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    private val fragments = mutableListOf<Fragment>()

    init {
        fragments.add(FirstFragment())
        fragments.add(SecondFragment())
        fragments.add(ThirdFragment())
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getCount(): Int {
        return fragments.size
    }
}
