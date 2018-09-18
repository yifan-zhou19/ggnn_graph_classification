package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int p;
		int n;
		j = 0;
		String a = new String(new char[14]);
		String b = new String(new char[4]);
		while (scanf("%s%s",a,b) != EOF)
		{
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) > a.charAt(j))
			{
				j = i;
			}
		}
			p = j;
			for (i = n - 1;i > j;i--)
			{
				a = tangible.StringFunctions.changeCharacter(a, i + 3, a.charAt(i));
			}
			a = tangible.StringFunctions.changeCharacter(a, p + 3, b.charAt(2));
			a = tangible.StringFunctions.changeCharacter(a, p + 2, b.charAt(1));
			a = tangible.StringFunctions.changeCharacter(a, p + 1, b.charAt(0));
			for (i = 0;i < n + 3;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			System.out.print("\n");
		}


	}
}

