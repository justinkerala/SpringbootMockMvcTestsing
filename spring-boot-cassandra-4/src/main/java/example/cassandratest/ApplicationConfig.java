package example.cassandratest;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.java.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories
class ApplicationConfig extends AbstractCassandraConfiguration {

  @Override
  public String getContactPoints() {
    return "localhost";
  }

  @Override
  protected String getKeyspaceName() {
	  //key space on my dvce
    return "mykeyspace";
  }
}