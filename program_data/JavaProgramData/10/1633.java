package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		int[] b = new int[a];
		int[] c = new int[a];
		int[] d = new int[25];
	   for (i = 0;i <= a - 1;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   b[a - 1 - i] = Integer.parseInt(tempVar2);
		   }
	   }
		c[0] = 1;
		for (i = 1;i <= a - 1;i++)
		{
			  for (k = 0;k <= 24;k++)
			  {
				  d[k] = 0;
			  }
			  for (j = i - 1;j >= 0;j--)
			  {
					if (b[i] >= b[j])
					{
					d[j] = c[j] + 1;
					}
				  if (b[i] < b[j] && j == 0)
				  {
					d[j] = 1;
				  }
			  }
			  for (k = 0;k <= 23;k++)
			  {
				if (d[k] > d[k + 1])
				{
					int n = d[k];
					d[k] = d[k + 1];
					d[k + 1] = n;
				}
			  }
			  c[i] = d[24];
		}
		for (i = 0;i <= a - 2;i++)
		{
		   if (c[i] > c[i + 1])
		   {
			   int n = c[i];
			   c[i] = c[i + 1];
			   c[i + 1] = n;
		   }
		}
		System.out.printf("%d",c[a - 1]);
	}

}

