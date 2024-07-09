package com.alurachallenge.api.foroHub.domain.usuarios;

public record DatosAutenticacionUsuario(String login, String clave) {
}

// la clave se genera un un encriptador o algoritmo de hashing en la web https://www.browserling.com/tools/bcrypt