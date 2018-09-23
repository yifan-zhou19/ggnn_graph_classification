package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max;
		int max1;
		int t;
		int k;
		int[] x = new int[28];
		int n;
		int a;
		int b;
		int c;
		int d;
		int i;
		int j;
		char cc;
		char[][] y = new char[100][32];
		char q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			cc = tempVar2.charAt(0);
		}
		for (i = 1;i <= n;i++)
		{
			y[i] = new Scanner(System.in).nextLine();
			for (j = 2;y[i][j];j++)
			{
				if (y[i][j] >= 'A' && y[i][j] <= 'Z')
				{
					x[y[i][j] + 1 - 'A']++;
				}
			}
		}
		max = x[1];
		max1 = 1;
		for (i = 2;i <= 26;i++)
		{
			if (x[i] > max)
			{
				max = x[i];
				max1 = i;
			}
		}
		q = 'A' - 1 + max1;
		System.out.printf("%c\n",q);
		System.out.printf("%d\n",max);
		for (i = 1;i <= n;i++)
		{
			for (j = 2;y[i][j];j++)
			{
				if (y[i][j] == q)
				{
					for (t = 0;y[i][t];t++)
					{
						if (y[i][t] == ' ')
						{
							break;
						}
						else
						{
							System.out.printf("%c",y[i][t]);
						}
					}
					System.out.print("\n");
				break;
				}
			}
		}
	}



}

