package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		String c = new String(new char[251]);
		char e;
		int m;
		int n;
		int i;
		int l;
		int x;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
			 m = b.length();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 48);
		}
		for (i = 0;i < m;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 48);
		}

		for (i = 0;i < n / 2;i++)
		{
				 e = a.charAt(i);
		   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(n - 1 - i));
		   a = tangible.StringFunctions.changeCharacter(a, n - i - 1, e);
		}
		for (i = 0;i < m / 2;i++)
		{
				e = b.charAt(i);
		   b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(m - 1 - i));
		   b = tangible.StringFunctions.changeCharacter(b, m - i - 1, e);
		}
		for (i = n - 1;i > 0;i--)
		{
			if (a.charAt(i) == 0 && n != 1)
			{
				n--;
			}
			else
			{
				break;
			}
		}
		for (i = m - 1;i > 0;i--)
		{
			if (b.charAt(i) == 0 && m != 1)
			{
				m--;
			}
			else
			{
				break;
			}
		}
		if (n < m)
		{
			l = n;
			x = m;
				for (i = 0;i < l;i++)
				{
				  if ((a.charAt(i) + b.charAt(i)) < 10)
				  {
					  b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + b.charAt(i));
				  }
				  else
				  {
					b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + b.charAt(i) - 10);
					for (j = i + 1;j <= x;j++)
					{
						if (j == x)
						{
							System.out.print("1");
							break;
						}

						if (b.charAt(j) + 1 < 10)
						{
						  b.charAt(j)++;
						  break;
						}
						else
						{
						  b = b.substring(0, j);
						}
					}

				  }
				}

			for (i = x - 1;i > -1;i--)
			{
				System.out.printf("%c",b.charAt(i) + 48);
			}
		}
		else
		{
			l = m;
			x = n;

			for (i = 0;i < l;i++)
			{
				if ((a.charAt(i) + b.charAt(i)) < 10)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + b.charAt(i));
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + b.charAt(i) - 10);
					for (j = i + 1;j <= x;j++)
					{
						if (j == x)
						{
							System.out.print("1");
							break;
						}

						if (a.charAt(j) + 1 < 10)
						{
						  a.charAt(j)++;
						  break;
						}
						else
						{
						  a = a.substring(0, j);
						}
					}

				}
			}

			for (i = x - 1;i > -1;i--)
			{
				System.out.printf("%c",a.charAt(i) + 48);
			}
		}
		return 0;
	}
}

