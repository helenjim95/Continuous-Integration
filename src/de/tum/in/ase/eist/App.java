package de.tum.in.ase.eist;

import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.Level;

public final class App {

	private App() {
	}

	public static void main(String[] args) {
		//4: Make sure to use the Configurator to configure the loggers root level
		Configurator.setRootLevel(Level.INFO);
		//This is a workaround for a known issue when starting JavaFX applications 
		UniversityApp.startApp(args);
	}
}
