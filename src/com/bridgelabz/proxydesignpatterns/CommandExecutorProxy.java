package com.bridgelabz.proxydesignpatterns;

import java.io.IOException;

public class CommandExecutorProxy implements CommandExecutor {
	
	private boolean isAdmin;

	public  CommandExecutorProxy(String user , String password) {
		if(user.equals("Admin") && (password.equals("admin"))){
			isAdmin = true;
		}
		
	}

	@Override
	public void runCommand(String command) throws IOException {
		CommandExecutorImpl executorImpl = new CommandExecutorImpl();
		if (isAdmin) {
			executorImpl.runCommand(command);
			
		}else {
			if(command.trim().startsWith("rm")) {
				System.out.println("non-admin user not use rm command ");
			}
			else
				executorImpl.runCommand(command);
		}
		
	}

}
