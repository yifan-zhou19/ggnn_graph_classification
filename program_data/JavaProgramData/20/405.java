package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int ii;
		char[][] res = new char[100][20];
		int p = 0;
		char c;
		String sub1 = new String(new char[20]);
		String sub2 = new String(new char[20]);
		String str = new String(new char[20]);
		String substr = new String(new char[5]);
	while (scanf("%s %s", str,substr) != EOF)
	{
					c = 0;
		  for (i = 0;i < str.length();i++)
		  {
		 if (str.charAt(i) > c)
		 {
		 c = str.charAt(i);
		 ii = i;
		 }
		  }
			  sub1 = str;
		 sub1 = tangible.StringFunctions.changeCharacter(sub1, ii + 1, '\0');
		 sub1 = strcat(sub1,substr);
		 for (i = ii + 1;i < str.length();i++)
		 {
		 sub2 = tangible.StringFunctions.changeCharacter(sub2, i - ii - 1, str.charAt(i));
		 }
		 sub2 = tangible.StringFunctions.changeCharacter(sub2, str.length() - ii - 1, '\0');
		 res[p] = strcat(sub1,sub2);
					p++;
	}
	for (i = 0;i < p;i++)
	{
	System.out.printf("%s\n",res[i]);
	}
	}

}

