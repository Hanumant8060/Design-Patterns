package com.bridgelabz.proxydesignpatterns;

import java.io.IOException;

public interface CommandExecutor {
	public void runCommand(String command) throws IOException;

}
