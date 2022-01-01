package com.example.mpchartandroid.screen

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.mpchartandroid.BaseFragment2
import com.example.mpchartandroid.databinding.BarChartLayoutBinding
import com.example.mpchartandroid.db.DummyDB
import com.example.mpchartandroid.extension.simpleAxisStyle

class BarChartFragment:BaseFragment2<BarChartLayoutBinding>() {
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
    ): BarChartLayoutBinding {
        return BarChartLayoutBinding.inflate(inflater, container, false)
    }
}