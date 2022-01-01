package com.example.mpchartandroid.screen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.graphics.toColorInt
import com.example.mpchartandroid.BaseFragment2
import com.example.mpchartandroid.R
import com.example.mpchartandroid.databinding.BubbleChartFragmentLayoutBinding
import com.example.mpchartandroid.db.DummyDB
import com.example.mpchartandroid.extension.simpleAxisStyle
import com.github.mikephil.charting.data.*

class BubbleChartFragment : BaseFragment2<BubbleChartFragmentLayoutBinding>() {

    override fun preInit() {

    }

    override fun postInit() {
        binding.chart.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.lily))
        binding.chart.data = DummyDB(requireContext()).bubbleData
        hideGrid()
        drawChart()
    }

    private fun drawChart() {
        binding.chart.invalidate()
    }

    private fun hideGrid() {
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
    ): BubbleChartFragmentLayoutBinding {
        return BubbleChartFragmentLayoutBinding.inflate(inflater, container, false)
    }

}