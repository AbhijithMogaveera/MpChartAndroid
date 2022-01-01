package com.example.mpchartandroid.screen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.mpchartandroid.BaseFragment2
import com.example.mpchartandroid.R
import com.example.mpchartandroid.databinding.RadarChartFragmentLayoutBinding
import com.github.mikephil.charting.data.RadarData
import com.github.mikephil.charting.data.RadarDataSet
import com.github.mikephil.charting.data.RadarEntry

class RadarChartFragment : BaseFragment2<RadarChartFragmentLayoutBinding>() {
    override fun preInit() {

    }

    override fun postInit() {
        binding.chart.data = RadarData(
            listOf(
                RadarDataSet(
                    listOf(
                        RadarEntry(10f),
                        RadarEntry(20f),
                        RadarEntry(30f),
                        RadarEntry(40f),
                        RadarEntry(50f),
                    ), "Sample"
                ).apply {
                    color =ContextCompat.getColor(requireContext(), R.color.blue_chill)
                }, RadarDataSet(
                    listOf(
                        RadarEntry(45f),
                        RadarEntry(34f),
                        RadarEntry(66f),
                        RadarEntry(45f),
                    ), "Sample"
                ).apply {
                    color =ContextCompat.getColor(requireContext(), R.color.selective_yellow)
                }
            )
        )
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
    ): RadarChartFragmentLayoutBinding {
        return RadarChartFragmentLayoutBinding.inflate(inflater, container, false)
    }
}