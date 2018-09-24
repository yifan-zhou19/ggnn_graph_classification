package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[300];
		int[] jg = new int[300];
		int i;
		int k;
		int j;
		int m = 0;
		for (i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   sz[i] = Integer.parseInt(tempVar2);
		   }
		}
		for (i = 0;i < n;i++)
		{
		 for (k = 0;k < i;k++)
		 {
		  if (sz[i] == sz[k])
		  {
			sz[i] = 0;
			break;
		  }
		  else
		  {
			continue;
		  }
		 }
		}
		for (i = 0;i < n;i++)
		{
		  if (sz[i] != 0)
		  {
		  jg[m] = sz[i];
		  m++;
		  }
		}
		for (j = 0;j < m - 1;j++)
		{
		  System.out.printf("%d,",jg[j]);
		}
		System.out.printf("%d",jg[m - 1]);
	return 0;
	}
}

