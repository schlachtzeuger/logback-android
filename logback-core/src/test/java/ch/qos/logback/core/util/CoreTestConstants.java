/**
 * Logback: the reliable, generic, fast and flexible logging framework.
 * Copyright (C) 1999-2011, QOS.ch. All rights reserved.
 *
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *
 *   or (per the licensee's choosing)
 *
 * under the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation.
 */
package ch.qos.logback.core.util;

import java.io.File;

public class CoreTestConstants {

	public static final String BASE_DIR;
	static {
		String dir = "/sdcard/.logback_test/";
		if (!new File(dir).exists()) {
			dir = "";
		}
		BASE_DIR = dir;
	}
	
  public static final String TEST_DIR_PREFIX = BASE_DIR + "src/test/";
  public static final String JORAN_INPUT_PREFIX = TEST_DIR_PREFIX
      + "input/joran/";

  public static final String TARGET_DIR = BASE_DIR + "target/";
  public static final String OUTPUT_DIR_PREFIX = TARGET_DIR + "test-output/";

  public static final int SUCCESSFUL_EXIT_CODE = 8;
  public static final int FAILURE_EXIT_CODE = 1;

  public static final String BASH_PATH_ON_CYGWIN = "c:/cygwin/bin/bash";
  public static final String BASH_PATH_ON_LINUX = "bash";
}
