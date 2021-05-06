package com.company.Funcionamiento;

import com.company.Datos.Cancion;

public interface Reproduccion {
    abstract void Reproducir();
    abstract void AgregarCancion(Cancion cancion);

    abstract void EliminarCancion();
    abstract void VerMiLista();

    abstract void CambiarCancion(Cancion cancion);

}
