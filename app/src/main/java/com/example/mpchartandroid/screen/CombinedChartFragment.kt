package com.example.mpchartandroid.screen

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.mpchartandroid.BaseFragment2
import com.example.mpchartandroid.databinding.CombinedChartLayoutBinding
import com.example.mpchartandroid.db.DummyDB
import com.github.mikephil.charting.data.CombinedData
import com.github.mikephil.charting.data.LineData

class CombinedChartFragment :BaseFragment2<CombinedChartLayoutBinding>(){
    override fun preInit() {

    }

    override fun postInit() {
        val dummyDB = DummyDB(requireContext())
        binding.chart.data  = CombinedData().apply {
            setData(dummyDB.candleData)
            setData(dummyDB.lineData)
            setData(dummyDB.bubbleData)
        }
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
    ): CombinedChartLayoutBinding {
        return CombinedChartLayoutBinding.inflate(inflater, container, false)
    }

}