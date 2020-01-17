package com.bridgelabz.proxydesignpatterns;

import java.io.IOException;

public class ProxyPatternTest {
	public static void main(String[] args) throws IOException {
		CommandExecutor execute = new CommandExecutorProxy("Admin", "password");
		execute.runCommand("ls -ltr");
		execute.runCommand(" rm -rf abc.pdf");
	}

}
