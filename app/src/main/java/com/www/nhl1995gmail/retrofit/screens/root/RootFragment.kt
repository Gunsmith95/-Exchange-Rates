package com.www.nhl1995gmail.retrofit.screens.root

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.viewbinding.ViewBinding
import com.google.android.material.tabs.TabLayoutMediator
import com.www.nhl1995gmail.retrofit.R
import com.www.nhl1995gmail.retrofit.ViewPagerAdapter
import com.www.nhl1995gmail.retrofit.databinding.FragmentRootBinding


class RootFragment : Fragment() {

    private var _binding: FragmentRootBinding? = null
    private val binding get() = _binding!!

    private var ctx: Context? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        ctx = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRootBinding.inflate(inflater, container, false)

        binding.viewPager.adapter = ViewPagerAdapter(ctx as FragmentActivity)
        binding.tabLayout.tabIconTint = null

        TabLayoutMediator(binding.tabLayout,binding.viewPager){
            tab, pos ->
            when (pos){
                0 -> {
                    tab.setIcon(R.drawable.ic_baseline_monetization_on_24)
                }
                1 -> {
                    tab.setIcon(R.drawable.ic_baseline_attach_money_24)
                }
            }
        }.attach()

        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}