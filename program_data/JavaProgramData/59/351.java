package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String k = new String(new char[100]);
		int[][] a = new int[100][100];
		int i;
		int j;
		int l;
		int n;
		int d;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = tangible.StringFunctions.changeCharacter(k, 0, System.in.read());
		for (i = 0;i < n;i++)
		{
			k = new Scanner(System.in).nextLine();
			for (j = 0;j < n;j++)
			{
				if (k.charAt(j) == '.')
				{
					a[i][j] = 1;
				}
				if (k.charAt(j) == '#')
				{
					a[i][j] = 0;
				}
				if (k.charAt(j) == '@')
				{
					a[i][j] = 2;
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d = Integer.parseInt(tempVar2);
		}
		for (l = 0;l < d;l++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == 1)
					{
						if (i > 0 && a[i - 1][j] >= 2 && a[i - 1][j] <= l + 1)
						{
							a[i][j] = l + 2;
							continue;
						}
						if (i < n - 1 && a[i + 1][j] >= 2 && a[i + 1][j] <= l + 1)
						{
							a[i][j] = l + 2;
							continue;
						}
						if (j > 0 && a[i][j - 1] >= 2 && a[i][j - 1] <= l + 1)
						{
							a[i][j] = l + 2;
							continue;
						}
						if (j < n - 1 && a[i][j + 1] >= 2 && a[i][j + 1] <= l + 1)
						{
							a[i][j] = l + 2;
							continue;
						}
					}
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] >= 2)
				{
				t++;
				}
			}
		}
				System.out.printf("%d\n",t);
	}

}

