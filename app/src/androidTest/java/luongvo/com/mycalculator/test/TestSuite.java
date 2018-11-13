package luongvo.com.mycalculator.test;

import luongvo.com.mycalculator.test.features.AddingFeatureTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.util.Locale;

@RunWith(Suite.class)@Suite.SuiteClasses({
        AddingFeatureTest.class,
})
public class TestSuite
{
    public static final Locale ENGLISH = new Locale("en", "GB");
    public static final Locale SPANISH = new Locale("es", "ES");
}