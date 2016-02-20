package abc.test;

import org.apache.felix.dm.DependencyActivatorBase;
import org.apache.felix.dm.DependencyManager;
import org.osgi.framework.BundleContext;

public class Activator extends DependencyActivatorBase
{
  private String who;

  @Override
  public void init(BundleContext context, DependencyManager dm)
  {
    dm.add(createComponent()
        .setImplementation(this)
        .add(createServiceDependency()
            .setService(String.class)
            .setAutoConfig("who")
            .setRequired(true)));
  }

  @Override
  public void destroy(BundleContext context, DependencyManager dm)
  {
  }

  private void start()
  {
    System.out.println("hello " + who);
  }
}
