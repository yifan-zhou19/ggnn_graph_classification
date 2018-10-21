package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[13]);
		String substr = new String(new char[3]);
		int s;
		int i;
		int j;
		int p;
		int max;
		while (scanf("%s %s",str,substr) != EOF) //EOF????????????????????
		{
		s = str.length();
		max = str.charAt(0);
		for (i = 0;i <= s - 1;i++)
		{
			if (str.charAt(i) > max)
			{
				max = str.charAt(i);
				  p = i;
			}
		}
		for (i = s;i >= p + 1;i--)
		{
			str = tangible.StringFunctions.changeCharacter(str, i + 3, str.charAt(i));
		}
		for (i = p + 1,j = 0;j <= 2;i++,j++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, substr.charAt(j));
		}
		for (i = 0;i <= s + 2;i++)
		{
		System.out.printf("%c",str.charAt(i));
		}
		System.out.print("\n");
		}
	}
}

