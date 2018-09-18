package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] p = new int[100][100];
	int n;
	int i;
	int j;
	int h;
	int k;
	int m;
	int l;
	int a = 0;
	int b = 0;
	int sum;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i][j] = Integer.parseInt(tempVar2);
			}
		}
	}
	for (h = 0;h < n;h++)
	{
	for (k = 0;k < n;k++)
	{
		if (p[h][k] == 0)
		{
			a++;
		}
	}
	if (a != 0)
	{
		break;
	}
	}
	for (m = 0;m < n;m++)
	{
		for (l = 0;l < n;l++)
		{
			if (p[l][m] == 0)
			{
				b++;
			}
		}
		if (b != 0)
		{
			break;
		}
	}
	sum = (a - 2) * (b - 2);
	System.out.printf("%d\n",sum);
	}


}

