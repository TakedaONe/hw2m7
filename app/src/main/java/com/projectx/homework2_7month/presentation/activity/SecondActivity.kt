package com.projectx.homework2_7month.presentation.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.projectx.homework2_7month.databinding.ActivitySecondBinding
import com.projectx.homework2_7month.presentation.TaskAdapter
import com.projectx.homework2_7month.presentation.viewmodel.MainActivityViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class SecondActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivitySecondBinding.inflate(layoutInflater)
    }
    private val viewModel: MainActivityViewModel by viewModel()
    private lateinit var myAdapter: TaskAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        myAdapter = TaskAdapter(emptyList())
        binding.rvTask.adapter = myAdapter

        
        viewModel.tasks.observe(this, Observer { tasks ->
            myAdapter.updateTasks(tasks)
        })

        
        viewModel.loadTasks()
    }
}
