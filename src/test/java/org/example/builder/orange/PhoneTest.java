package org.example.builder.orange;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneTest {

  private final Logger logger = LoggerFactory.getLogger(PhoneTest.class);

  @Test
  public void test() {
    Phone phone = Phone.builder().system("Android")
      .brandName("Motorola")
      .model("Moto G4")
      .build();

    logger.info("phone: {}", phone);

    assertEquals(phone.getSystem(), "Android");


  }
}
