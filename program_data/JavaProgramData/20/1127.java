package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		int n;
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		String a = new String(new char[14]);
		char b;
		while (scanf("%s%s",str,substr) != EOF)
		{
			n = str.length();
			b = str.charAt(0);
			k = 0;
			for (i = 1;i < n;i++)
			{
				if (b < str.charAt(i))
				{
					b = str.charAt(i);
					k = i;
				}
			}
			for (i = 0;i <= k;i++)
			{
			a = tangible.StringFunctions.changeCharacter(a, i, str.charAt(i));
			}
			a = tangible.StringFunctions.changeCharacter(a, k + 1, substr.charAt(0));
			a = tangible.StringFunctions.changeCharacter(a, k + 2, substr.charAt(1));
			a = tangible.StringFunctions.changeCharacter(a, k + 3, substr.charAt(2));
			for (i = k + 4;i <= n + 2;i++)
			{
			a = tangible.StringFunctions.changeCharacter(a, i, str.charAt(i - 3));
			}
			for (i = 0;i <= n + 2;i++)
			{
			System.out.printf("%c",a.charAt(i));
			}
			System.out.print("\n");
		}
	}
}

