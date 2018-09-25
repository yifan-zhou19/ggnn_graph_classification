package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int n;
		  String str1 = new String(new char[1001]);
		  String str2 = new String(new char[1001]);
	 str1 = new Scanner(System.in).nextLine();
	 for (j = 0;;j++)
	 {
		 if (str1.charAt(j) == '\0')
		 {
				  str2 = tangible.StringFunctions.changeCharacter(str2, j, '\0');
				  break;
		 }
	  if (str1.charAt(j) >= 'a' && str1.charAt(j) <= 'z')
	  {
	  str2 = tangible.StringFunctions.changeCharacter(str2, j, str1.charAt(j) - 'a'+'A');
	  }
	  else
	  {
		  str2 = tangible.StringFunctions.changeCharacter(str2, j, str1.charAt(j));
	  }
	 }

	 for (j = 0;;j = j + n)
	 {
		 if (str1.charAt(j) == '\0')
		 {
				  str2 = tangible.StringFunctions.changeCharacter(str2, j, '\0');
				  break;
		 }

	  for (n = 0;;n++)
	  {
	 if (str2.charAt(j) != str2.charAt(j + n))
	 {
		  System.out.printf("(%c,%d)",str2.charAt(j),n);
	 break;
	 }
	  }
	 }


	}

}

