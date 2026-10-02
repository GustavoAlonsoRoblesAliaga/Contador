package com.example.semana7

    import androidx.lifecycle.ViewModel
    import kotlinx.coroutines.flow.MutableStateFlow
    import kotlinx.coroutines.flow.StateFlow
    import kotlinx.coroutines.flow.asStateFlow

    class ContadorViewModel : ViewModel() {

        private val _count = MutableStateFlow(0)


        val count: StateFlow<Int> = _count.asStateFlow()


        fun incrementCount() {
            _count.value += 1
        }
    }