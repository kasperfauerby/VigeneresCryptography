package demo.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportFactoryTest {

    private TransportFactory transportFactory;

    @BeforeEach
    public void start() {
        this.transportFactory = new TransportFactory();
    }

    @Test
    public void create_success() {
        String keyword = "";
        String code = "";
        transportFactory.create(keyword, code);


    }

    @Test
    public void create_failure() {

    }

}
