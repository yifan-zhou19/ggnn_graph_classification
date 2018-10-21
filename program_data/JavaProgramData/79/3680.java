package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int[] n = new int[100];
	int[] m = new int[100];
	int r;
	int row = 0;
	do
	{
		row++;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[row] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m[row] = Integer.parseInt(tempVar2);
		}

	}while (n[row] != 0 && m[row] != 0);

	int[] a = new int[300];

	int j = 0;
	int k = 0;
	int L;
	for (r = 1; r < row; r++)
	{
		for (i = 1; i <= n[r]; i++)
		{
			a[i] = i;
		}

		for (i = 1; i <= n[r]; i++)
		{
			if (a[i] != 0)
			{
				j++;
				if (j == m[r])
				{
					a[i] = 0;
					k++;
					j = 0;
				}
			}
			if (i == n[r])
			{
				i = 0;
			}
			if (k == n[r] - 1)
			{
				for (i = 1; i <= n[r]; i++)
				{
					if (a[i] != 0)
					{
						L = a[i];
					}
				}
				break;
			}
		}
		j = 0;
		k = 0;
		System.out.printf("%d\n",L);
	}


	return 0;
	}

}

