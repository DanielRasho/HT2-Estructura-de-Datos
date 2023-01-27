package App_main;

import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerTest {

    @Test
    public void leerArchivo() {
        Controller c = new Controller();
        c.leerArchivo();
    }
}