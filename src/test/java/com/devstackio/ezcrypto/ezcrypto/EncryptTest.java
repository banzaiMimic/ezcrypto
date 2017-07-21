package com.devstackio.ezcrypto.ezcrypto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author devstack
 */
public class EncryptTest {
    
    private String key;
    private String initVector;
    
    public EncryptTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.key = Encrypt.INSTANCE.getKey();
        this.initVector = Encrypt.INSTANCE.getInitVector();
    }
    
    @After
    public void tearDown() {
    }

    @org.junit.Test
    public void testDecrypt() {
        String message = "message!";
        String encrypted = Encrypt.INSTANCE.encrypt(this.key, this.initVector, message);
        String result = Encrypt.INSTANCE.decrypt(this.key, this.initVector, encrypted);
        assertEquals(message, result);
    }
    
    @org.junit.Test
    public void testCustom() {
        String message = "message!";
        String key = "draCu3nCIe7l2345";
        String initVector = "Rand3mThR34t5tor";
        String encrypted = Encrypt.INSTANCE.encrypt(key, initVector, message);
        String result = Encrypt.INSTANCE.decrypt(key, initVector, encrypted);
        assertEquals(message, result);
    }
    
}
