package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[50]);
		String str2 = new String(new char[50]);
		int i;
		int k;
		int n;
		int m;
		while (scanf("%s%s",str1,str2) != EOF)
		{
			 k = 0;
			 m = str1.length();
			for (i = 0;i < m;i++)
			{
				if (str1.charAt(i) > str1.charAt(k))
				{
					k = i;
				}
			}
			n = str2.length();
			for (i = str1.length();i > k;i--)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i + n, str1.charAt(i));
			}
				for (i = 0;i < n;i++)
				{
					str1 = tangible.StringFunctions.changeCharacter(str1, k + 1 + i, str2.charAt(i));
				}
				System.out.printf("%s\n",str1);
		}
		return 0;
	}
}

