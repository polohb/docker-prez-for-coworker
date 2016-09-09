package com.total.sandbox;

import java.util.Collection;

public class Bidon {

  private String goodNaming = "";

  public Bidon(String val) {

    goodNaming = val;
  }

  public String getGoodNaming() {
    return goodNaming;
  }

  //sonar test 
  String[] getAsArray(Collection c) {
    return (String[]) c.toArray();
  }

  public void test() {
    try {
      /* ... */
    }
    catch (Exception e) {
      e.printStackTrace(); // Non-Compliant
    }
  }
}
