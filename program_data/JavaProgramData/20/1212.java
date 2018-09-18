package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[14]);
		String substr = new String(new char[4]);
		int i;
		int n;
		int k = 0;
		while (scanf("%s%s",str,substr) != EOF)
		{
			n = str.length();
		for (i = 0;i < n;i++)
		{
		if (str.charAt(i) > str.charAt(k))
		{
			k = i;
		}
		}
		for (i = n;i > k;i--)
		{
		str = tangible.StringFunctions.changeCharacter(str, i + 3, str.charAt(i));
		}
		for (i = 1;i < 4;i++)
		{
		str = tangible.StringFunctions.changeCharacter(str, k + i, substr.charAt(i - 1));
		}
		System.out.println(str);
		}
	}
}

