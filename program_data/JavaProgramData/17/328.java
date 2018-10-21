package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		while (true)
		{
			final String a = "";
			final String b = "";
			int i = 0;
			char x = '\0';
			while (true)
			{
				x = System.in.read();
				if (x == '\n')
				{
					break;
				}
				a = tangible.StringFunctions.changeCharacter(a, i, x);
				b = tangible.StringFunctions.changeCharacter(b, i, x);
				i++;
			}
			int k = 1;
			int j;
			int n;
			while (k < i)
			{
				for (j = 0;j < i - k;j++)
				{
					int zhongjian = 0;
					int l;
					if (k != 1)
					{
						for (l = j + 1;l < j + k;l++)
						{
							if (a.charAt(l) == '(' || a.charAt(l) == ')')
							{
								zhongjian = 1;
							}
						}
					}

					if (a.charAt(j) == '(' && a.charAt(j + k) == ')' && zhongjian == 0)
					{
						a = tangible.StringFunctions.changeCharacter(a, j, '\0');
						a = tangible.StringFunctions.changeCharacter(a, j + k, '\0');

					}
				}

				k = k + 1;

			}
			for (n = 0;n < i;n++)
			{

				if (a.charAt(n) == '(')
				{
					a = tangible.StringFunctions.changeCharacter(a, n, '$');
				}
				else if (a.charAt(n) == ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, n, '?');
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, n, ' ');
				}
			}

			for (n = 0;n < i;n++)
			{
				System.out.print(b.charAt(n));
			}
			System.out.print("\n");
			for (n = 0;n < i;n++)
			{
				System.out.print(a.charAt(n));
			}
			System.out.print("\n");

		}
		return 0;

	}
}

