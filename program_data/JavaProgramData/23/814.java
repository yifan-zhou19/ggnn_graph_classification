package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String s1 = new String(new char[101]);
		  String s2 = new String(new char[101]);
		  int i;
		  int j;
		  int p;
		  int k;
		  for (j = 0;j < 101;j++)
		  {
			  s1 = tangible.StringFunctions.changeCharacter(s1, j, '\0');
		  }
		  s1 = new Scanner(System.in).nextLine();
		  k = s1.length() - 1;
		  for (i = s1.length() - 1;i >= 0;i--)
		  {
				if (s1.charAt(i) == ' ')
				{
					  for (j = 0;j < 101;j++)
					  {
						  s2 = tangible.StringFunctions.changeCharacter(s2, j, '\0');
					  }
					  for (p = 0;p < k - i;p++)
					  {
						  s2 = tangible.StringFunctions.changeCharacter(s2, p, s1.charAt(i + 1 + p));
					  }
					  System.out.printf("%s ",s2);
					  k = i - 1;
				}
				else if (i == 0)
				{
					  for (j = 0;j < 101;j++)
					  {
						  s2 = tangible.StringFunctions.changeCharacter(s2, j, '\0');
					  }
					  for (p = 0;p <= k;p++)
					  {
						  s2 = tangible.StringFunctions.changeCharacter(s2, p, s1.charAt(p));
					  }
					  System.out.printf("%s",s2);
				}
		  }
	}


}

