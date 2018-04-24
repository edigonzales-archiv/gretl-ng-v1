package ch.so.agi.gretl.tasks;

import ch.so.agi.gretl.logging.GretlLogger;
import ch.so.agi.gretl.logging.LogEnvironment;
import org.gradle.api.tasks.TaskAction;

public class PostgisRasterExport {
    private GretlLogger log;

    @TaskAction
    public void exportPostgisRaster() {
        log = LogEnvironment.getLogger(PostgisRasterExport.class);


        log.lifecycle("FUUUUUUBAR");
    }

}
