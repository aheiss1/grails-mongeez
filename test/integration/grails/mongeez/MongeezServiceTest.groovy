package grails.mongeez

import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.Test
import support.MongoResource

class MongeezServiceTest {

    MongeezService mongeezService

    static mongoResource = new MongoResource()

    @BeforeClass
    public static void setup() {
        mongoResource.before()
    }

    @AfterClass
    public static void cleanup() {
        mongoResource.after()
    }

    @Test
    public void testMongeezServiceReportsAppropriatePendingChangeSets() {
        def originalPendingSize = mongeezService.getPendingChangeSets().size()
        assert(originalPendingSize > 0)

        // run mongeez
        mongeezService.mongeez.execute()

        def newPendingSize = mongeezService.getPendingChangeSets().size()

        // there is one script that is set to alwaysRun, most are not always run.
        // so not asserting on size of 0, just less than before
        assert(newPendingSize < originalPendingSize)
    }
}