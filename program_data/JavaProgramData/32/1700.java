package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int m;
		int j;
		int k;
		int p;
		int q = 0;
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		String c = new String(new char[100]);
		String d = new String(new char[100]);
		String e = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 2;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			b[i] = new Scanner(System.in).nextLine();
			scanf("\n");

		}
		a[n - 1] = new Scanner(System.in).nextLine();
		b[n - 1] = new Scanner(System.in).nextLine();
		for (i = 0;i <= n - 1;i++)
		{
			l = String.valueOf(a[i]).length();
			m = String.valueOf(b[i]).length();
			c = b[i];
			for (j = 0;j <= l - 1;j++)
			{
				if (j <= l - m - 1)
				{
					b[i][j] = '0';
				}
				if (j > l - m - 1)
				{
					b[i][j] = c.charAt(j - l + m);
				}
			}
			for (j = l - 1;j >= 0;j--)
			{
				if (a[i][j] < b[i][j])
				{
					d = tangible.StringFunctions.changeCharacter(d, j, a[i][j] - b[i][j] + 10 + 48);
					q = 0;
					for (p = 1;;p++)
					{
						if (a[i][j - p] == '0')
						{
							q = q + 1;
							a[i][j - p] = '9';
						}
						if (a[i][j - p] != '0')
						{
							break;
						}
					}
					a[i][j - q - 1] = a[i][j - q - 1] - 1;

				}
				if (a[i][j] >= b[i][j])
				{
					d = tangible.StringFunctions.changeCharacter(d, j, a[i][j] - b[i][j] + 48);
				}
			}
			for (j = 0;j <= l - 1;j++)
			{
			  if (d.charAt(j) != '0')
			  {
				  k = j;
				  break;
			  }
			}
			  for (j = k;j <= l - 1;j++)
			  {
				  System.out.printf("%c",d.charAt(j));
			  }
			  if (i != n - 1)
			  {
			  System.out.print("\n");
			  }
			  for (j = 0;j <= 99;j++)
			  {
				  d = tangible.StringFunctions.changeCharacter(d, j, '0');
			  }
		}
		return 0;
	}
}

