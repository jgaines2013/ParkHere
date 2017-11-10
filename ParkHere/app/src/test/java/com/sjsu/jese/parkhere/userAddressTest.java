package com.sjsu.jese.parkhere;

/**
 * Created by jerry on 11/9/17.
 */

import com.sjsu.jese.parkhere.model.Address;
import com.sjsu.jese.parkhere.model.Customer;
import com.sjsu.jese.parkhere.model.Post;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *^^^ these may need to be in android test, but generally these will test values
 *
 * use mock user create change Address check its as expected
 */
public class userAddressTest {
    @Test
    public void userAddress_isCorrect() throws Exception {
        Address addr = new Address("1 raider way", "San Jose", "CA", 95112, "USA");
        Customer c = new Customer("", "", addr);

        assertEquals(addr + "", c.getAddress() + "");
    }
}