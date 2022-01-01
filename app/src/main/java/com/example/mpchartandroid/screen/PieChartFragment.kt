package com.example.mpchartandroid.screen

import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.mpchartandroid.BaseFragment2
import com.example.mpchartandroid.R
import com.example.mpchartandroid.databinding.PieChartLayoutBindingBinding
import com.example.mpchartandroid.db.DummyDB
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry

class PieChartFragment : BaseFragment2<PieChartLayoutBindingBinding>() {
    override fun preInit() {

    }

    override fun postInit() {
        binding.chart.data = DummyDB(requireContext()).pieData
        binding.chart.isDrawHoleEnabled = false
        binding.chart.setDrawRoundedSlices(true)
        binding.chart.setCenterTextTypeface(
            Typeface.SANS_SERIF
        )
        binding.chart.setEntryLabelColor(ContextCompat.getColor(requireContext(), R.color.black))
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
    ): PieChartLayoutBindingBinding {
        return PieChartLayoutBindingBinding.inflate(inflater, container, false)
    }
}