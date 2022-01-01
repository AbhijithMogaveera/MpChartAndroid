package com.example.mpchartandroid.customchart

import android.content.Context
import android.util.AttributeSet
import com.github.mikephil.charting.charts.BarLineChartBase
import com.github.mikephil.charting.data.ScatterData

class ScatterChart
@JvmOverloads constructor(
    context: Context? = null,
    attrs: AttributeSet? = null,
    defStyle: Int=0
) : BarLineChartBase<ScatterData>(context, attrs, defStyle) {

}