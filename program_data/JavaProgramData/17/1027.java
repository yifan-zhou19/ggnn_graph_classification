package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		while (gets(a) != null)
		{
			n = a.length();
			for (i = 0;i < n;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, ' ');
			}
			for (i = 0;i < n;i++)
			{
				if ((a.charAt(i) == '(') || (a.charAt(i) == ')'))
				{
					b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i));
				}
			}
			for (i = 0;i < n;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			System.out.print("\n");
			for (i = n - 1;i >= 0;i--)
			{
				if (b.charAt(i) == '(')
				{
					for (j = i;j < n;j++)
					{
						if (b.charAt(j) == ')')
						{
							b = tangible.StringFunctions.changeCharacter(b, i, ' ');
							b = tangible.StringFunctions.changeCharacter(b, j, ' ');
							a = tangible.StringFunctions.changeCharacter(a, i, ' ');
							a = tangible.StringFunctions.changeCharacter(a, j, ' ');
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
				else if (a.charAt(i) == ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '?');
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, i, ' ');
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

