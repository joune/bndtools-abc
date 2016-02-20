package abc.test;

import junit.framework.TestCase;
import org.osgi.framework.FrameworkUtil;

class MyTest extends TestCase
{
  public void testOne() {
    new Activator().start(FrameworkUtil.getBundle(this.getClass).getBundleContext)
  }
}
