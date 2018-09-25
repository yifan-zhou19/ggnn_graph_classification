int panduan = new int(int, int);

int main()
{
	int[][] a = new int[10][10];
	int m;
	int n;
	int[] t = new int[10];
	int i;
	int j;

	for (i = 0; i < 5; i++)
	{
		for (j = 0; j < 5; j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][j] = Integer.parseInt(tempVar);
			}
		}
	}

	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}

	if (panduan(n, m))
	{
		for (i = 0; i < 5; i++)
		{
			t[i] = a[m][i];
			a[m][i] = a[n][i];
			a[n][i] = t[i];
		}
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				System.out.printf("%d", a[i][j]);
				if (j == 4)
				{
					System.out.print("\n");
				}
				else
				{
					System.out.print(" ");
				}
			}
		}
	}
	else
	{
		System.out.print("error\n");
	}

	return 0;
}

int panduan(int n, int m)
{
	if (m > 4 || n > 4)
	{
		return 0;
	}
	else
	{
		return 1;
	}
}

