package com.example.mpchartandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.CallSuper
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.viewbinding.ViewBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

abstract class BaseFragment2<T : ViewBinding>(
) : Fragment() {

    private var _binding: T? = null
    val binding get() = _binding!!

    var isViewCreated = false
        private set

    final override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let(::fetchExtras)
        preInit()
        setUpViewModel()
    }

    open fun setUpViewModel() {

    }

    final override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = getBinding(inflater, container)
        isViewCreated = true
        return binding.root

    }

    //it's a lifecycle aware coroutine
    open suspend fun suspendablePostInit(
        scope: CoroutineScope
    ) {

    }

    final override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        savedInstanceState?.let {
            init(it)
        }
        lifecycleScope.launch {
            viewLifecycleOwner
                .lifecycle
                .repeatOnLifecycle(Lifecycle.State.STARTED) {
                    suspendablePostInit(this)
                }
        }
        postInit()
  }

    open fun whenUserNotLoggedIn() {

    }


    @CallSuper
    protected open fun fetchExtras(extras: Bundle) {
        //
    }


    /*^
    * Called before creating a view
    * */
    abstract fun preInit()

    /*^
    * Called after creating a view with saved instance
    * */
    open fun init(savedInstanceState: Bundle) {}

    /*^
    * Called after creating a view
    * */
    abstract fun postInit()

    final override fun onResume() {
        onBecameVisibleToUser()
        super.onResume()
    }

    final override fun onPause() {
        onBecameInvisibleToUser()
        super.onPause()
    }

    abstract fun onBecameVisibleToUser()

    abstract fun onBecameInvisibleToUser()

    final override fun onDestroyView() {
        if (_binding != null) {
            onRecycle()
        }
        _binding = null
        super.onDestroyView()
    }

    abstract fun onRecycle()

    protected abstract fun getBinding(inflater: LayoutInflater, container: ViewGroup?): T


    fun toast(string: String) {
        Toast.makeText(requireContext(), string, Toast.LENGTH_SHORT).show()
    }

    open fun changeColorSchema(viewGroup: ViewGroup, childCount: Int) {}
}
