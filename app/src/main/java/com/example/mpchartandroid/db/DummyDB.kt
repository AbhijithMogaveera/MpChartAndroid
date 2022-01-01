package com.example.mpchartandroid.db

import android.content.Context
import android.graphics.Paint
import androidx.core.content.ContextCompat
import androidx.core.graphics.toColorInt
import com.example.mpchartandroid.R
import com.github.mikephil.charting.data.*

class DummyDB(context: Context) {

    //Dataset
    val scatterDataSet1 = ScatterDataSet(
        listOf(
            Entry(10f, 35f),
            Entry(52f, 99f),
            Entry(24f, 33f),
            Entry(75f, 54f),
            Entry(83f, 46f),
            Entry(35f, 76f),
            Entry(76f, 77f),
            Entry(43f, 34f),
            Entry(87f, 58f),
            Entry(49f, 44f),
            Entry(52f, 86f),
        ),"Sample"
    ).also {scatterDataSet ->
        scatterDataSet.color = ContextCompat.getColor(context, R.color.blue_chill)
    }
    val pieDataSet1: PieDataSet = PieDataSet(
        listOf(
            PieEntry(13f).apply {
                this.label = "Value 1"
            },
            PieEntry(14f).apply {
                this.label = "Value 2"
            },
            PieEntry(16f).apply {
                this.label = "Value 3"
            },
            PieEntry(9f).apply {
                this.label = "Value 4"
            },
        ), "Sample"
    ).apply {
        colors = mutableListOf(
            ContextCompat.getColor(context, R.color.selective_yellow),
            ContextCompat.getColor(context, R.color.blue_chill),
            ContextCompat.getColor(context, R.color.cosmic),
            ContextCompat.getColor(context, R.color.white),
        )
    }
    val barDataSet1: BarDataSet = BarDataSet(
        listOf(
            BarEntry(1f, 10f),
            BarEntry(2f, 20f),
            BarEntry(3f, 40f),
            BarEntry(4f, 30f),
            BarEntry(5f, 54f),
            BarEntry(6f, 67f),
            BarEntry(7f, 56f),
            BarEntry(8f, 45f),
            BarEntry(9f, 45f),
            BarEntry(10f, 35f),
            BarEntry(11f, 34f),
        ), "Sample 1"
    ).also { dataSet ->
        dataSet.color = ContextCompat.getColor(context, R.color.selective_yellow)
    }
    val bubbleDataSet1: BubbleDataSet = BubbleDataSet(
        listOf(
            BubbleEntry(1f, 33f, 15f),
            BubbleEntry(2f, 68f, 03f),
            BubbleEntry(3f, 70f, 05f),
            BubbleEntry(4f, 95f, 11f),
            BubbleEntry(5f, 15f, 16f)
        ), "sample 1"
    ).also { dataSet ->
        dataSet.color = "#7d3865".toColorInt()
    }

    val bubbleDataSet2: BubbleDataSet = BubbleDataSet(
        listOf(
            BubbleEntry(1f, 33f, 12f),
            BubbleEntry(2f, 68f, 34f),
            BubbleEntry(3f, 70f, 13f),
            BubbleEntry(4f, 95f, 5f),
            BubbleEntry(5f, 15f, 10f)
        ), "sample 1"
    ).also { dataSet ->
        dataSet.color = "#f8b703".toColorInt()
    }

    val lineDataSet1: LineDataSet = LineDataSet(
        listOf(
            Entry(1f, 43f),
            Entry(2f, 58f),
            Entry(3f, 60f),
            Entry(4f, 45f),
            Entry(5f, 55f)
        ), "Sample 1"
    ).also { dataSet ->
        dataSet.mode = LineDataSet.Mode.CUBIC_BEZIER
        dataSet.color = "#7d3865".toColorInt()
        dataSet.lineWidth = 3f
        dataSet.setCircleColor("#f8b703".toColorInt())
        dataSet.fillAlpha = 255
    }

    val lineDataSet2: LineDataSet = LineDataSet(
        listOf(
            Entry(1f, 33f),
            Entry(2f, 68f),
            Entry(3f, 70f),
            Entry(4f, 95f),
            Entry(5f, 15f)
        ), "Sample 2"
    ).also { dataSet ->
        dataSet.mode = LineDataSet.Mode.CUBIC_BEZIER
        dataSet.setCircleColor("#f8b703".toColorInt())
        dataSet.color = "#0fa2a9".toColorInt()
        dataSet.lineWidth = 3f
        dataSet.fillAlpha = 255
    }

    val candleDataSet1 = CandleDataSet(
        listOf(
            CandleEntry(0f, 225.0f, 219.84f, 224.94f, 221.07f),
            CandleEntry(1f, 228.35f, 222.57f, 223.52f, 226.41f),
            CandleEntry(2f, 226.84f, 222.52f, 225.75f, 223.84f),
            CandleEntry(3f, 222.95f, 217.27f, 222.15f, 217.88f),
        ), "Sample 1"
    ).apply {
        color = ContextCompat.getColor(context, R.color.black)
        shadowColor = ContextCompat.getColor(context, R.color.black)
        decreasingColor = ContextCompat.getColor(context, R.color.blue_chill)
        decreasingPaintStyle = Paint.Style.FILL
        increasingColor = ContextCompat.getColor(context, R.color.selective_yellow)
        increasingPaintStyle = Paint.Style.FILL
        neutralColor = ContextCompat.getColor(context, R.color.cosmic)
    }

    //Data
    val lineData: LineData = LineData(lineDataSet1, lineDataSet2)
    val candleData: CandleData = CandleData(candleDataSet1)
    val bubbleData: BubbleData = BubbleData(bubbleDataSet1, bubbleDataSet2)
    val barData: BarData = BarData(barDataSet1)
    val pieData: PieData = PieData(pieDataSet1)
    val scatterSet: ScatterData = ScatterData(scatterDataSet1)
}