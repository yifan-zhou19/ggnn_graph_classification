package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int la;
		int lb;
		int k;
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		final String c = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = new Scanner(System.in).nextLine();
		b[0] = new Scanner(System.in).nextLine();
		for (i = 1; i < n; i++)
		{
			scanf("\n");
			a[i] = new Scanner(System.in).nextLine();
			b[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0; i < n; i++)
		{
			la = String.valueOf(a[i]).length();
			lb = String.valueOf(b[i]).length();
			for (j = la - 1; j >= la - lb; j--)
			{
				if (a[i][j] >= b[i][j - la + lb])
				{
					a[i][j] = a[i][j] - b[i][j - la + lb] + 48;
				}
				else
				{
					a[i][j] = 58 + a[i][j] - b[i][j - la + lb];
					if (a[i][j - 1] > '0')
					{
						a[i][j - 1]--;
					}
					else
					{
						k = j;
						while (a[i][k - 1] == '0')
						{
							a[i][k - 1] = '9';
							k--;
						}
						a[i][k - 1]--;
					}
				}
			}
			k = 0;
			for (j = 0; a[i][j] != '\0'; j++)
			{
				if (a[i][j] != '0')
				{
					break;
				}
			}
			for (j = j; a[i][j] != '\0'; j++)
			{
				c.charAt(i)[k] = a[i][j];
				k++;
			}
			System.out.println(c.charAt(i));
		}
	}
}

