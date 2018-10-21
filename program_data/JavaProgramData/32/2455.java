package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String a = new String(new char[102]);
		String b = new String(new char[102]);
		char[][] c = new char[10][102];
		int i;
		int j;
		int k;
		int m;
		int v;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (x = 0;x < n;x++)
		{
			System.in.read();
			for (m = 0;m < 102;m++)
			{
				c[x][m] = '0';
			}
			for (i = 0;i < 102;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, System.in.read());
				if (a.charAt(i) == '\n')
				{
					break;
				}
			}
			for (j = 0;j < 102;j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, System.in.read());
				if (b.charAt(j) == '\n')
				{
					break;
				}
			}
			for (k = 101;k + i - 101 >= 0;k--)
			{
				a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k + i - 101));
			}
			for (k = 0;k < 101 - i;k++)
			{
				a = tangible.StringFunctions.changeCharacter(a, k, '0');
			}
			for (k = 101;k + j - 101 >= 0;k--)
			{
				b = tangible.StringFunctions.changeCharacter(b, k, b.charAt(k + j - 101));
			}
			for (k = 0;k < 101 - j;k++)
			{
				b = tangible.StringFunctions.changeCharacter(b, k, '0'); //?a?b?????
			}
			for (k = 0;k <= 101;k++)
			{
				if (a.charAt(k) != b.charAt(k))
				{
					break; //?a,b?????????,????
				}
			}
			for (m = 100;m >= 0;m--)
			{
					if (a.charAt(m) < b.charAt(m))
					{
						c[x][m] = a.charAt(m) + 58 - b.charAt(m);
						a = tangible.StringFunctions.changeCharacter(a, m - 1, a.charAt(m - 1) - 1); //??
					}
					else
					{
						c[x][m] = a.charAt(m) + 48 - b.charAt(m);
					}
			}
			for (i = 0;i < 102;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '0');
			}
			for (j = 0;j < 102;j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '0'); //??????a?b?0
			}
		}
		for (x = 0;x < n;x++)
		{
			for (k = 0;k <= 101;k++)
			{
				if (c[x][k] != '0')
				{
					break;
				}
			}
			for (m = k;m <= 100;m++)
			{
				System.out.printf("%c",c[x][m]); //??
			}
			for (k = 0;k <= 100;k++)
			{
				v = v + c[x][k];
			}
			if (v == 48)
			{
				System.out.print("0");
			}
			System.out.print("\n");
		}
	}
}

