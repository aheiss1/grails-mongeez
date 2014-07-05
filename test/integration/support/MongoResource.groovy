package support

import de.flapdoodle.embed.mongo.MongodExecutable
import de.flapdoodle.embed.mongo.MongodProcess
import de.flapdoodle.embed.mongo.MongodStarter
import de.flapdoodle.embed.mongo.config.MongodConfigBuilder
import de.flapdoodle.embed.mongo.config.Net
import de.flapdoodle.embed.mongo.distribution.Version
import de.flapdoodle.embed.process.runtime.Network
import org.junit.rules.ExternalResource

public class MongoResource extends ExternalResource {
    private MongodExecutable mongodExecutable
    private MongodProcess mongodProcess

    @Override
    protected void before() throws Throwable {
        def mongodStarter = MongodStarter.defaultInstance
        def mongodConfig = new MongodConfigBuilder()
                .version(Version.Main.V2_2)
                .net(new Net(27017, Network.localhostIsIPv6()))
                .build()
        mongodExecutable = mongodStarter.prepare(mongodConfig)
        mongodProcess = mongodExecutable.start()
    }

    @Override
    protected void after() {
        mongodProcess.stop()
        mongodExecutable.stop()
    }
}


