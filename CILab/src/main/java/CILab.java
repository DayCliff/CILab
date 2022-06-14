public class CILab implements CILabInterface
{
  private String myString;

  @Override
  public String getString()
  {
    return myString;
  }

  @Override
  public void setString(String string)
  {
    myString = string;
  }

  @Override
  public boolean detectCapitalUse()
  {
    //can't test an empty string
    //throws Illegal argument exception for empty string
    if(myString.length() == 0)
    {
      throw new IllegalArgumentException("String cannot be null");
    }
    //if first letter is uppercase check the rest for correct capital usage
    if(Character.isUpperCase(myString.charAt(0)))
    {
      //start at two to test two chars at a times
      for(int i = 2; i < myString.length(); i++)
      {
        //if DoG return false
        if(Character.isUpperCase((myString.charAt(i))) && !Character.isUpperCase(myString.charAt(i - 1)))
        {
          return false;
        }
        //else if DOg return false
        else if(!Character.isUpperCase((myString.charAt(i))) && Character.isUpperCase(myString.charAt(i - 1)))
        {
          return false;
        }
      }
    }
    //if first letter is lowercase look through for consistency
    else
    {
      //if any letters are uppercase, return false
      for(int i = 1; i < myString.length(); i++)
      {
        if(Character.isUpperCase(myString.charAt(i)))
        {
          return false;
        }
      }
    }
    //else return true
    return true;
  }

}

