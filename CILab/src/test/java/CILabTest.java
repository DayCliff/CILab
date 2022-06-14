import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest
{

  private CILabInterface myString;

  @BeforeEach
  public void setUp()
  {
    myString = new CILab();
  }

  @AfterEach
  public void tearDown()
  {
    myString = null;
  }

  @Test
  public void detectCapitalUseTest1()
  {
    myString.setString("");

    assertThrows(IllegalArgumentException.class, () ->myString.detectCapitalUse());
  }

  @Test
  public void detectCapitalUseTest2()
  {
    myString.setString("BellevueCollege");

    assertFalse(myString.detectCapitalUse());
  }

  @Test
  public void detectCapitalUseTest3()
  {
    myString.setString("Right");

    assertTrue(myString.detectCapitalUse());
  }

  @Test
  public void detectCapitalUseTest4()
  {
    myString.setString("EEK");

    assertTrue(myString.detectCapitalUse());
  }

  @Test
  public void detectCapitalUseTest5()
  {
    myString.setString("eek");

    assertTrue(myString.detectCapitalUse());
  }

  @Test
  public void detectCapitalUseTest6()
  {
    myString.setString("eeK");

    assertFalse(myString.detectCapitalUse());
  }
}
