package com.ecar.ws.it;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ecar.ws.cli.ECarClient;


/**
 * Test suite
 */
public class PingIT extends BaseIT {

    // tests
    // assertEquals(expected, actual);

    // public String ping(String x)

    @Test
    public void pingEmptyTest() {
        assertNotNull(client.testPing("test"));
    }


}
