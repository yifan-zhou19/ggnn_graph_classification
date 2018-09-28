package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
	int[][] a = new int[8][8];
	int[] t = new int[8];
	int[] p = new int[8];

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < m;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i][0] = Integer.parseInt(tempVar3);
		}
		t[i] = a[i][0],p[i] = 0;
		for (j = 1;j < n;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i][j] = Integer.parseInt(tempVar4);
			}
			if (a[i][j] > t[i])
			{
				t[i] = a[i][j],p[i] = j;
			}
		}
	}

	k = 0;
	for (i = 0;i < m;i++)
	{
		j = 0;
		while (a[j][p[i]] >= t[i] != 0 && j < m)
		{
			j++;
		}
		if (j == m)
		{
			System.out.printf("%d+%d\n",i,p[i]),k++;
		}
	}
	if (k == 0)
	{
		System.out.print("No\n");
	}
	return 0;
	}
}

