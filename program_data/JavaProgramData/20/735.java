package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[15]);
		String substr = new String(new char[4]);
		char k;
		int i;
		int j;
		int t;
		while (scanf("%s%s",str,substr) != EOF)
		{
			for (k = i = 0;str.charAt(i) != 0;i++)
			{
				if (str.charAt(i) > k)
				{
					k = str.charAt(i);
					j = i;
				}
			}
			for (t = i + 3;t > j + 3;t--)
			{
				str = tangible.StringFunctions.changeCharacter(str, t, str.charAt(t - 3));
			}
			for (i = 0;i < 3;i++)
			{
				str = tangible.StringFunctions.changeCharacter(str, j + 1 + i, substr.charAt(i));
			}
			System.out.printf("%s\n",str);
		}
	}
}

