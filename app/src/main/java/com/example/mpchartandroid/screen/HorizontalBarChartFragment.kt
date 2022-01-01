package com.example.mpchartandroid.screen

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.mpchartandroid.BaseFragment2
import com.example.mpchartandroid.databinding.HorizontalBarchartLayoutBinding
import com.example.mpchartandroid.db.DummyDB
import com.example.mpchartandroid.extension.simpleAxisStyle
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry

class HorizontalBarChartFragment:BaseFragment2<HorizontalBarchartLayoutBinding>() {
    override fun preInit() {

    }

    override fun postInit() {
        binding.chart.data = DummyDB(requireContext()).barData
        binding.chart.simpleAxisStyle()

    }

    override fun onBecameVisibleToUser() {

    }

    override fun onBecameInvisibleToUser() {

    }

    override fun onRecycle() {

    }

    override fun getBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): HorizontalBarchartLayoutBinding {
        return HorizontalBarchartLayoutBinding.inflate(inflater, container, false)
    }
}