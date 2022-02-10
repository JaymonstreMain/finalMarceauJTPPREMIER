package tests_conformites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
{ CercleConformeTest.class, FormeExceptionConformeTest.class,
		RectangleConformeTest.class })
public class AllTests
{

}
