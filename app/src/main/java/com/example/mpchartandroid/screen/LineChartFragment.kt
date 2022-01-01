package com.example.mpchartandroid.screen

import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.mpchartandroid.BaseFragment2
import com.example.mpchartandroid.R
import com.example.mpchartandroid.databinding.LineChartFragmentLayoutBinding
import com.example.mpchartandroid.db.DummyDB
import com.example.mpchartandroid.extension.simpleAxisStyle
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.highlight.Highlight
import com.github.mikephil.charting.listener.ChartTouchListener
import com.github.mikephil.charting.listener.OnChartGestureListener
import com.github.mikephil.charting.listener.OnChartValueSelectedListener

class LineChartFragment : BaseFragment2<LineChartFragmentLayoutBinding>(), OnChartGestureListener,
    OnChartValueSelectedListener {

    override fun preInit() {

    }

    override fun postInit() {
        binding.chart.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.lily))
        val dummyDB = DummyDB(requireContext())
        binding.chart.data = dummyDB.lineData
        setUpChartCallBack()
        hideGrid()
        drawChart()
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
    ): LineChartFragmentLayoutBinding {
        return LineChartFragmentLayoutBinding.inflate(inflater, container, false)
    }

    private fun hideGrid() {
        binding.chart.simpleAxisStyle()

    }

    private fun drawChart() {
        binding.chart.invalidate()
    }

    private fun setUpChartCallBack() {
        binding.chart.onChartGestureListener = this
        binding.chart.setOnChartValueSelectedListener(this)
    }

    override fun onChartGestureStart(
        me: MotionEvent?,
        lastPerformedGesture: ChartTouchListener.ChartGesture?
    ) {

    }

    override fun onChartGestureEnd(
        me: MotionEvent?,
        lastPerformedGesture: ChartTouchListener.ChartGesture?
    ) {

    }

    override fun onChartLongPressed(me: MotionEvent?) {

    }

    override fun onChartDoubleTapped(me: MotionEvent?) {

    }

    override fun onChartSingleTapped(me: MotionEvent?) {

    }

    override fun onChartFling(
        me1: MotionEvent?,
        me2: MotionEvent?,
        velocityX: Float,
        velocityY: Float
    ) {

    }

    override fun onChartScale(me: MotionEvent?, scaleX: Float, scaleY: Float) {

    }

    override fun onChartTranslate(me: MotionEvent?, dX: Float, dY: Float) {

    }

    override fun onValueSelected(e: Entry?, h: Highlight?) {}

    override fun onNothingSelected() {

    }
}