package com.example.mpchartandroid.extension

import com.github.mikephil.charting.charts.BarLineChartBase

fun BarLineChartBase<*>.simpleAxisStyle() {
    axisLeft.apply {
        setDrawGridLines(false)
        setDrawAxisLine(true)
        setDrawLabels(true)
        setDrawGridLinesBehindData(true)
    };

    axisRight.apply {
        setDrawGridLines(false)
        setDrawAxisLine(false)
        setDrawLabels(false)
        setDrawGridLinesBehindData(true)
    }
    xAxis.apply {
        setDrawGridLines(false)
        setDrawAxisLine(true)
        setDrawLabels(true)
        setDrawGridLinesBehindData(true)
    }
}