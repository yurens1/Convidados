package viewmodel

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import repository.GuestModels
import repository.GuestRepository

class GuestFormViewModel(application: Application) : AndroidViewModel(application) {

private val repository = GuestRepository.getInstance(application)

fun insert (guest: GuestModels){
    repository.insert(guest)
}

}