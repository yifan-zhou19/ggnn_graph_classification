package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int j;
	int s;
	int p;
	int t;
	int q;
	int l;
	int k;
	int e = 0;
	int[][] a = new int[8][8];
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
		for (j = 0;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
		}
	}
	for (i = 0;i < m;i++)
	{
		for (j = 0;j < n;j++)
		{
			s = 1;
			l = 1;
			for (k = 0;k < n;k++)
			{
				if (a[i][j] > a[i][k])
				{
					s = s + 1;
				}
			}
			if (s == n)
			{
			  t = i;
			  p = j;
			  for (q = 0;q < m;q++)
			  {
				if (a[t][p] < a[q][p])
				{
				   l = l + 1;
				}
			  }
			if (l == m)
			{
				e = e+1;
				System.out.printf("%d+%d",t,p);
			}
			}
		}
	}
	if (e == 0)
	{
		System.out.print("No");
	}
		return 0;
	}


}

