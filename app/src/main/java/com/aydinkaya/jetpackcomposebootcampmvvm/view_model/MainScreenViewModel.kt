package com.aydinkaya.jetpackcomposebootcampmvvm.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aydinkaya.jetpackcomposebootcampmvvm.MatematikRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainScreenViewModel : ViewModel() {

    var sonuc = MutableLiveData("")
    var mrepo = MatematikRepository()


    fun add(alinanSayi1: String, alinanSayi2: String) {

        CoroutineScope(Dispatchers.Main).launch {
            sonuc.value = mrepo.add(alinanSayi1, alinanSayi2)
        }
    }


    fun multiplication(alinanSayi1: String, alinanSayi2: String) {

        CoroutineScope(Dispatchers.Main).launch {
            sonuc.value = mrepo.multiplication(alinanSayi1, alinanSayi2)
        }
    }

    /*


    fun add (alinanSayi1: String , alinanSayi2: String){

        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()


        val toplam =  sayi1 + sayi2

         sonuc.value= toplam.toString()
    }


    fun multiplication(alinanSayi1: String , alinanSayi2: String){

        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()
        val multiplication =  sayi1 * sayi2


        sonuc.value = multiplication.toString()
    }

     */
}