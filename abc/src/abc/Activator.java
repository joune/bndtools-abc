package abc;

import org.apache.felix.dm.DependencyActivatorBase;
import org.apache.felix.dm.DependencyManager;
import org.osgi.framework.BundleContext;

public class Activator extends DependencyActivatorBase
{
  @Override
  public void init(BundleContext context, DependencyManager dm)
  {
    dm.add(createComponent()
        .setInterface(String.class.getName(), null)
        .setImplementation("world")); //simplest useless component I could think of
  }

  @Override
  public void destroy(BundleContext context, DependencyManager dm)
  {
  }
}
