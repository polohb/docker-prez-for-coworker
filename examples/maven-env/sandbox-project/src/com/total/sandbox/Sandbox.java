package com.total.sandbox;

import java.util.logging.Logger;

public class Sandbox {

  private Sandbox() {
    //utility class : hide public constructor
  }

  private static final Logger LOG = Logger.getLogger(Sandbox.class.getName());

  public static void main(String[] args) {

    
    LOG.info("Coucou fixed sysout");

  }

}
