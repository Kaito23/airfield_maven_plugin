package de.adesso.airfieldFX;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * TODO
 * @author koetter
 */
@Mojo( name = "sayhi")
public class AirfieldMojo extends AbstractMojo {
	
	private String pathToApp;
	private String pathToPrivateKey;
	private String pathToPublicKey;
	private String pathToKeysDestination;

	public void execute() throws MojoExecutionException, MojoFailureException {
		// TODO Auto-generated method stub
		getLog().info( "Hello, world." );
		
	}


}
