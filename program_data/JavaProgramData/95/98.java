package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String str1 = new String(new char[100]);
	  String str2 = new String(new char[100]);
	  str1 = new Scanner(System.in).nextLine();
	  str2 = new Scanner(System.in).nextLine();
	  int i;
	  int j;
	  for (i = 0;str1.charAt(i) != '0';i++)
	  {
		  if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
		  {
			  str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
		  }
		  else
		  {
			  str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i));
		  }
	  }
	  for (j = 0;str2.charAt(j) != '0';j++)
	  {
		  if (str2.charAt(j) >= 'A' && str2.charAt(j) <= 'Z')
		  {
			  str2 = tangible.StringFunctions.changeCharacter(str2, j, str2.charAt(j) + 32);
		  }
		  else
		  {
			  str2 = tangible.StringFunctions.changeCharacter(str2, j, str2.charAt(j));
		  }
	  }
	  if (strcmp(str1,str2) == 0)
	  {
		  System.out.print("=\n");
	  }
	  else if (strcmp(str1,str2) > 0)
	  {
		  System.out.print(">\n");
	  }
		else if (strcmp(str1,str2) < 0)
		{
		  System.out.print("<\n");
		}
		 return 0;
	}
}

