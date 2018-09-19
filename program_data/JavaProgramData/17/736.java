package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[110]);
		int i;
		int j;
		int n;
		int m = 0;
		while (scanf("%s",a) != EOF)
		{
		n = a.length();
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		System.out.print("\n");
		for (i = n - 1;i >= 0;i--)
		{
			if (a.charAt(i) == '(')
			{
				for (j = i + 1;j < n;j++)
				{
					if (a.charAt(j) == ')')
					{
						a = tangible.StringFunctions.changeCharacter(a, i, 'a');
						a = tangible.StringFunctions.changeCharacter(a, j, 'a');
						break;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == '(')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '$');
			}
			else
			{
				if (a.charAt(i) == ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '?');
				}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, i, ' ');
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		System.out.print("\n");
		}
	}
}

