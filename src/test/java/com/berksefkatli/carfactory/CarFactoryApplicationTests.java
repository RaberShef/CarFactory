package com.berksefkatli.carfactory;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.berksefkatli.carfactory.controller.CarFactoryController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarFactoryApplicationTests {

    @Autowired
    private CarFactoryController carFactoryController;

    @Test
    void shouldSucceedWhenInputIsCabrio() {
        assertEquals("Cabrio Car has produced.", carFactoryController.produce("cabrio"));
    }

    @Test
    void shouldSucceedWhenInputIsSedan() {
        assertEquals("Sedan Car has produced.", carFactoryController.produce("sedan"));
    }

    @Test
    void shouldSucceedWhenInputIsHatchback() {
        assertEquals("Hatchback Car has produced.", carFactoryController.produce("hatchback"));
    }

    @Test
    void shouldFailWhenInputIsUnknownCarType() {
        assertEquals("Unknown car type received, must be of type 'cabrio', 'sedan' or 'hatchback'",
            carFactoryController.produce("suv"));
    }

}
