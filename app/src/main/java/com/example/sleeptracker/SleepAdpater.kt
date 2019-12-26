package com.example.sleeptracker
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SleepAdapter internal constructor(context:Context) : RecyclerView.Adapter<SleepAdapter.SleepViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SleepAdapter.SleepViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var words = emptyList<Word>() // Cached copy of words

    inner class SleepViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewQualityValue: TextView = itemView.findViewById(R.id.textViewQualityValue)
        val textViewStart : TextView = itemView.findViewById(R.id.textViewStart)
        val textViewEnd : TextView = itemView.findViewById(R.id.textViewEnd)
    }

}