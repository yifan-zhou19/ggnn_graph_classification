package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int x;
		String a = new String(new char[100]);
		final String b = "\0";
		a = new Scanner(System.in).nextLine();
		n = a.length();
		x = n;
		for (j = n - 1;j >= 0;j--)
		{
			if (a.charAt(j) == ' ')
			{
				for (i = j + 1;i < x;i++)
				{
					b = tangible.StringFunctions.changeCharacter(b, n - x - 1 + i - j, a.charAt(i));
				}
				x = j;
				b = tangible.StringFunctions.changeCharacter(b, n - 1 - j, a.charAt(j));
			}
		}
		if (j < 0)
		{
			for (i = 0;i < x;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, n - x + i, a.charAt(i));
			}
		}
		System.out.printf("%s",b);
	}
}

