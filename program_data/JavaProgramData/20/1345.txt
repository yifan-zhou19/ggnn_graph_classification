package <missing>;

public class GlobalMembers
{
	public static void charu(String str, String substr, int n)
	{
		int i;
		int k;
		String nstr = new String(new char[13]);
		char max;

		for (i = n;i >= 0;i--)
		{
			if (str[i].compareTo(max) >= 0)
			{
			max = str[i];
		k = i;
			}
		}

		for (i = 0;i <= k;i++)
		{
		nstr = tangible.StringFunctions.changeCharacter(nstr, i, str[i]);
		}
		for (i = 0;i <= 2;i++)
		{
		nstr = tangible.StringFunctions.changeCharacter(nstr, i + k + 1, substr[i]);
		}
		for (i = k + 4;i <= n + 3;i++)
		{
		nstr = tangible.StringFunctions.changeCharacter(nstr, i, str[i - 3]);
		}

		System.out.println(nstr);

	}

	public static int Main()
	{
		  String s1 = new String(new char[10]);
		  String s2 = new String(new char[4]);
		  int i;

		  while (scanf("%s%s",s1,s2) != EOF)
		  {
		  for (i = 0;s1.charAt(i) != '\0';i++)
		  {
			  ;
		  }
		  charu(s1, s2, i);
		  }


	}



}

