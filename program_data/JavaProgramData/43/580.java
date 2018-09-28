package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int i;
		  int j;
		  int k;
		  int[] a = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a[2] = 1;
		for (i = 3;i <= m;i = i + 2)
		{
		  k = Math.sqrt(i);
		  for (j = 2;j <= k;j++)
		  {
		  if (i % j == 0)
		  {
			  break;
		  }
		  }
		  if (j >= k + 1)
		  {
		  a[i] = 1;
		  }
		}
		for (i = 3;i <= m - 3;i++)
		{
		  if (a[i] != 0)
		  {
		  for (j = i;j <= m - 3;j++)
		  {
		  if ((j + i == m) && (a[j] != 0))
		  {
			  System.out.printf("%d %d\n",i,j);
		  }
		  }
		  }
		}
		return 0;
	}
}

