package com.total.sandbox;

import org.testng.annotations.Test;

public class SandboxTest {

  @Test(enabled = true)
  public void mainCall() {

    Sandbox.main(new String[0]);
  }

}
