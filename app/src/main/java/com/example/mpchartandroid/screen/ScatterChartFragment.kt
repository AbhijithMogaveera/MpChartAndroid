package com.example.mpchartandroid.screen

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.mpchartandroid.BaseFragment2
import com.example.mpchartandroid.databinding.ScatterChartLayoutBinding
import com.example.mpchartandroid.db.DummyDB
import com.example.mpchartandroid.extension.simpleAxisStyle
import com.github.mikephil.charting.data.ScatterData
import com.github.mikephil.charting.data.ScatterDataSet

class ScatterChartFragment:BaseFragment2<ScatterChartLayoutBinding>() {

    override fun preInit() {

    }

    override fun postInit() {
        binding.chart.data = DummyDB(requireContext()).scatterSet
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
    ): ScatterChartLayoutBinding {
        return ScatterChartLayoutBinding.inflate(inflater, container, false)
    }

}
