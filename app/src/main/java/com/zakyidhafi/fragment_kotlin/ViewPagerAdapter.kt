package com.zakyidhafi.fragment_kotlin

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(private val mContext: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val pages = listOf(
        fragment_first(),
        fragment_second(),
        fragment_third()
    )

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Tab Satu"
            1 -> "Tab Dua"
            else -> "Tab Tiga"
        }
    }
    override fun getCount(): Int {
        return pages.size
    }
//    companion object {
//        @StringRes
//        private val TAB_TITLES = intArrayOf(R.string.tab_text_1,
//            R.string.tab_text_2)
//    }
        }
