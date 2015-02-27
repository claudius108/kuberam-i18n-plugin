package ro.kuberam.maven.plugins.i18n.mojos;

import java.io.File;

import org.apache.maven.project.MavenProject;
import org.junit.Test;

import ro.kuberam.maven.plugins.utils.KuberamAbstractMojoTestBase;

public class GenerateIpL10nDataMojoTest extends KuberamAbstractMojoTestBase {

	// @Test
	// @Ignore
	// public void testSimpleProjectBuild() throws Exception {
	// executeMojo("src/test/resources/ro/kuberam/maven/plugins/i18n/mojos/generate-ip-l10n-data/plugin-config.xml");
	// }

	// @Test
	// public void testSettingMojoVariables() throws Exception {
	// GenerateIpL10nDataMojo mojo = new GenerateIpL10nDataMojo();
	//
	//
	//
	// assertEquals("myValueOne", (String) getVariableValueFromObject(mojo,
	// "keyOne"));
	//
	// }

	// private GenerateIpL10nDataMojo getMojo(String pluginXml) throws Exception
	// {
	// return (GenerateIpL10nDataMojo) lookupMojo("generate-ip-l10n-data",
	// basedir + "/src/test/plugin-configs/assembly/" + pluginXml);
	// }
	//
	// private GenerateIpL10nDataMojo executeMojo(String pluginXml) throws
	// Exception {
	// GenerateIpL10nDataMojo mojo = getMojo(pluginXml);
	//
	// mojo.execute();
	//
	// return mojo;
	// }

	@Test
	public void testMojoExecute() throws Exception {
		final GenerateIpL10nDataMojo mojo = this.mojo();
		setVariableValueToObject(mojo, "outputDir", new File(projectBuildDirectory));
		mojo.execute();
	}

	private GenerateIpL10nDataMojo mojo() throws Exception {
		final GenerateIpL10nDataMojo mojo = new GenerateIpL10nDataMojo();

		setVariableValueToObject(mojo, "outputDir", new File(projectBuildDirectory));
		mojo.setProject(new MavenProject());
		mojo.setRepoSession(newSession(newRepositorySystem()));

		return mojo;
	}

}
