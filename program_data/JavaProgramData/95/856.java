package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int i;
	  String str1 = new String(new char[100]);
	  String str2 = new String(new char[100]);
	  str1 = new Scanner(System.in).nextLine();
	  str2 = new Scanner(System.in).nextLine();
	  for (i = 0;;i++)
	  {
		  if (str1.charAt(i) == '\0')
		  {
			  break;
		  }
		  if (str1.charAt(i) != '\0')
		  {
		if (str1.charAt(i) <= 122 && str1.charAt(i) >= 97)
		{
		 str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 32);
		}
		  }
	  }
	  for (i = 0;;i++)
	  {
		  if (str2.charAt(i) == '\0')
		  {
			  break;
		  }
		  if (str2.charAt(i) != '\0')
		  {
		if (str2.charAt(i) <= 122 && str2.charAt(i) >= 97)
		{
		 str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) - 32);
		}
		  }
	  }
	  if (strcmp(str1,str2) == 0)
	  {
		  System.out.print("=");
	  }
	  else if (strcmp(str1,str2) > 0)
	  {
		  System.out.print(">");
	  }
	  else
	  {
		  System.out.print("<");
	  }
	}

}

