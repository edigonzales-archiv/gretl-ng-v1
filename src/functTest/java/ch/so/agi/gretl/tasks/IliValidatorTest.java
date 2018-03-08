package ch.so.agi.gretl.tasks;

import org.gradle.testkit.runner.BuildResult;
import org.gradle.testkit.runner.GradleRunner;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import static org.gradle.testkit.runner.TaskOutcome.*;

public class IliValidatorTest {
    @Rule public final TemporaryFolder testProjectDir = new TemporaryFolder();
    private File buildFile;

    @Before
    public void setup() throws IOException {
        buildFile = testProjectDir.newFile("build.gradle");
    }

    @Test
    public void testHelloWorldTask() throws IOException {
        String buildFileContent = "task helloWorld {" +
                "    doLast {" +
                "        println 'Hello world!'" +
                "    }" +
                "}";
        writeFile(buildFile, buildFileContent);

        BuildResult result = GradleRunner.create()
//                .withProjectDir(testProjectDir.getRoot())
                .withProjectDir(new File("/Users/stefan/sources/gretl-ng/src/functTest/jobs/iliValidator/"))
                .withArguments("validate", "-i")
                .withPluginClasspath()
                .build();

        GradleRunner runner = GradleRunner.create()
//                .withProjectDir(testProjectDir.getRoot())
                .withProjectDir(new File("/Users/stefan/sources/gretl-ng/src/functTest/jobs/iliValidator/"))
                .withArguments("validate", "-i")
                .withPluginClasspath();

        System.out.println(runner.getPluginClasspath());

        System.err.println(result.getOutput());
        
        assertTrue(result.getOutput().contains("...validation done"));
        assertEquals(SUCCESS, result.task(":validate").getOutcome());
    }

    private void writeFile(File destination, String content) throws IOException {
        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new FileWriter(destination));
            output.write(content);
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }
}
