package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[101]);

	public static int Main()
	{
		int i;
		int n;
		int j;
		int k;
		int m;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
				for (j = 0;j < 101;j++)
				{
				a = tangible.StringFunctions.changeCharacter(a, 0, '\0');
				}
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = tempVar2.charAt(0);
				}
				System.out.printf("%s\n",a);
				m = a.length();
				for (j = m - 1;j >= 0;j--)
				{
					if (a.charAt(j) == '(')
					{
						if (j == m - 1)
						{
							a = tangible.StringFunctions.changeCharacter(a, j, '$');
							continue;
						}
						b = 1;
						for (k = j + 1;k < m;k++)
						{

							if (a.charAt(k) == ')')
							{
								a = tangible.StringFunctions.changeCharacter(a, j, ' ');
								a = tangible.StringFunctions.changeCharacter(a, k, ' ');
								b = 0;
								break;
							}

						}
						if (b != 0)
						{
						a = tangible.StringFunctions.changeCharacter(a, j, '$');
						}
					}
				}
				for (j = m - 1;j >= 0;j--)
				{

					if (a.charAt(j) == ')')
					{
					a = tangible.StringFunctions.changeCharacter(a, j, '?');
					}
					else if (a.charAt(j) != '$')
					{
					a = tangible.StringFunctions.changeCharacter(a, j, ' ');
					}
				}
				System.out.printf("%s\n",a);

		}
		return 0;
	}
}

