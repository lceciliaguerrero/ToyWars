package com.lceciliacifpfbmoll.programing.toyWars;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class TestToyWarsAplication {
    @Test
    void cargaContexto() {
        String sitio = "La Mancha";
        String mensaje = String.format("En un lugar de %s de cuyo nombre no me acuerdo...", sitio);
        Assert.doesNotContain(mensaje, sitio + ".", "¡Quijote te mienten con la provincia!");
    }
}
