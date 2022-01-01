package com.example.mpchartandroid.screen

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.mpchartandroid.BaseFragment2
import com.example.mpchartandroid.databinding.CandleStickChartFragmentBinding
import com.example.mpchartandroid.db.DummyDB
import com.example.mpchartandroid.extension.simpleAxisStyle

class CandleStickFragment:BaseFragment2<CandleStickChartFragmentBinding>() {

    override fun preInit() {

    }

    override fun postInit() {
        binding.chart.data = DummyDB(requireContext()).candleData
        binding.chart.simpleAxisStyle()
        binding.chart.invalidate()
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
    ): CandleStickChartFragmentBinding {
        return CandleStickChartFragmentBinding.inflate(inflater, container, false)
    }
}