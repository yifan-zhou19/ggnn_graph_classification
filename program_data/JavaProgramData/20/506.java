package <missing>;

public class GlobalMembers
{
	public static int count(String str, int len)
	{
		int i;
		int maxi = 0;
		for (i = 0;i < len;i++)
		{
			if (str[i].compareTo(str[maxi]) > 0)
			{
				maxi = i;
			}
		}
		return maxi;
	}

	public static void Main()
	{
		int n;
		int len;
		int j;
		String sa = new String(new char[14]);
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		while (scanf("%s%s",str,substr) != EOF)
		{
			 len = str.length();
			n = count(str, len);
			for (j = 0;j <= n;j++)
			{
				sa = tangible.StringFunctions.changeCharacter(sa, j, str.charAt(j));
			}
			for (j = n + 1;j <= n + 3;j++)
			{
				sa = tangible.StringFunctions.changeCharacter(sa, j, substr.charAt(j - n - 1));
			}
			for (j = n + 4;j <= len + 2;j++)
			{
				sa = tangible.StringFunctions.changeCharacter(sa, j, str.charAt(j - 3));
			}
			sa = tangible.StringFunctions.changeCharacter(sa, len + 3, '\0');
			System.out.printf("%s\n",sa);
		}
	}



}

