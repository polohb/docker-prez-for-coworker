package com.total.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BidonTest {

  @Test(enabled = true)
  public void withBadparam() {

    String input = "toto";

    Bidon b = new Bidon(input);

    Assert.assertEquals(b.getGoodNaming(), input);
  }

  @Test(enabled = true)
  public void withBadparam2() {

    String input = "totadazazdo";

    Bidon b = new Bidon(input);

    Assert.assertEquals(b.getGoodNaming(), input);
  }

}
