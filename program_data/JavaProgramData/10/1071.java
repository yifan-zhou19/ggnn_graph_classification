package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int i;
	int j;
	int n;
	int m;
	int temp;
	int[] a = new int[26];
	int[] g = new int[26];

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= k;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}

	for (m = 1;m <= k;m++)
	{
	g[m] = 1;
	}

	for (n = k - 1;n > 0;n--)
	{
	  for (j = n + 1;j <= k;j++)
	  {
		  if (a[n] >= a[j] != 0 && g[n] - 1 < g[j])
		  {
		  g[n] = g[j] + 1;
		  }
	  }
	}

	for (i = 1;i < k;i++)
	{
		for (j = i + 1;j <= k;j++)
		{
	if (g[i] < g[j])
	{
		temp = g[i];
		g[i] = g[j];
		g[j] = temp;
	}
		}
	}
	System.out.printf("%d",g[1]);
	}

}

