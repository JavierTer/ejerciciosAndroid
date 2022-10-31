package ar.edu.ort.challenge3.Entities

import android.os.Parcel
import android.os.Parcelable

class DatoParcelableNuevo(val param1 : String) : Parcelable {

    var unDato: String

    //en esta linea del constructor le decimos como queremos que construya la clase
    //con los datos que le pasamos en los argumentos
    //y como queremos que la guarde.
    constructor(parcel: Parcel) : this(parcel.readString().toString())

        init {
            this.unDato = param1

        }


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(unDato)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DatoParcelableNuevo> {
        override fun createFromParcel(parcel: Parcel): DatoParcelableNuevo {
            return DatoParcelableNuevo(parcel)
        }

        override fun newArray(size: Int): Array<DatoParcelableNuevo?> {
            return arrayOfNulls(size)
        }
    }


}