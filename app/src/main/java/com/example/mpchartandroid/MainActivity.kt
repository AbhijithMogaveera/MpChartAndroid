package com.example.mpchartandroid

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mpchartandroid.databinding.ActivityMainBinding
import com.example.mpchartandroid.screen.*
import com.github.mikephil.charting.data.ScatterData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val objects = listOf(
            "Line chart",
            "Bubble Chart",
            "Candle Stick Chart",
            "Combined Chart",
            "Horizontal Bar Chart",
            "Bar Chart",
            "Pie Chart",
            "Radar Chart",
            "Scatter Chart"
        )
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.vp2.isUserInputEnabled = false
        binding.vp2.adapter =
            object : FragmentStateAdapter(supportFragmentManager, this.lifecycle) {
                override fun getItemCount(): Int {
                    return 9
                }

                override fun createFragment(position: Int): Fragment {
                    return when (position) {
                        0 -> LineChartFragment()
                        1 -> BubbleChartFragment()
                        2 -> CandleStickFragment()
                        3 -> CombinedChartFragment()
                        4 -> HorizontalBarChartFragment()
                        5 -> BarChartFragment()
                        6 -> PieChartFragment()
                        7 -> RadarChartFragment()
                        8 -> ScatterChartFragment()
                        else -> throw Exception("No fragment for $position")
                    }
                }

            }

        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemClickListener,
            AdapterView.OnItemSelectedListener {
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                binding.vp2.setCurrentItem(p2, false)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }

        binding.spinner.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            objects
        )
    }
}