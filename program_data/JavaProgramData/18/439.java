package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int b;
	int j;
	int k;
	int a;
	int[][] su = new int[100][100];
	int result;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	b = n;
	for (i = 0;i < n;i++)
	{
		result = 0;
		for (j = 0;j < n;j++)
		{
			for (k = 0;k < n;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					su[j][k] = Integer.parseInt(tempVar2);
				}
			}
		}

			while (n > 1)
			{
	for (j = 0;j < n;j++)
	{
	   a = su[j][0];
		for (k = 0;k < n;k++)
		{
		if (a > su[j][k])
		{
			a = su[j][k];
		}
		}
		for (k = 0;k < n;k++)
		{
		su[j][k] -= a;
		}
	}
	for (k = 0;k < n;k++)
	{
		a = su[0][k];
		for (j = 0;j < n;j++)
		{
		if (a > su[j][k])
		{
			a = su[j][k];
		}
		}
		for (j = 0;j < n;j++)
		{
		su[j][k] -= a;
		}
	}
	result += su[1][1];
	for (j = 0;j < n - 1;j++)
	{
		for (k = 0;k < n - 1;k++)
		{
	if (j == 0 && k > 0)
	{
	su[j][k] = su[j][k + 1];
	}
	else if (k == 0 && j > 0)
	{
	su[j][k] = su[j + 1][k];
	}
	else if (j > 0 && k > 0)
	{
	su[j][k] = su[j + 1][k + 1];
	}
		}
	}
	n--;
			}
	System.out.printf("%d\n",result);
	n = b;
	}
	return 0;
	}
}

