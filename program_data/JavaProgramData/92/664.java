package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1001];
		int[] b = new int[1001];
		int m;
		int n;
		int i;
		int j;
		int k;
		int o;
		int p;
		for (;;)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			break;
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < n;i++)
		{
		   for (j = 0;j < n - 1;j++)
		   {
		   if (b[j] > b[j + 1])
		   {
				 k = b[j];
				 b[j] = b[j + 1];
				 b[j + 1] = k;
		   }
		   if (a[j] > a[j + 1])
		   {
				 k = a[j];
				 a[j] = a[j + 1];
				 a[j + 1] = k;
		   }
		   }
		}
		  k = 0;
		  o = 0;
		  m = 0;
		  p = 0;
		for (i = 0;i + p < n;)
		{
			  if (a[i] > b[o])
			  {
				  k++;
				  o++;
				  i++;
				  continue;
			  }
			  if (a[i] < b[o])
			  {
				  k--;
				  i++;
				  m++;
				  continue;
			  }
			  if (a[n - p - 1] > b[n - m - 1] && a[i] == b[o])
			  {
				  k++;
				  p++;
				  m++;
				  continue;
			  }
			  if (a[n - p - 1] < b[n - m - 1] && a[i] == b[o])
			  {
				  k--;
				  i++;
				  m++;
				  continue;
			  }
			  if (a[n - p - 1] == b[n - m - 1] && a[i] == b[o])
			  {
				  if (a[i] < b[n - m - 1])
				  {
					  k--;
				  }
				  i++;
				  m++;
				  continue;
			  }
		}
		System.out.printf("%d\n",200 * k);
		}
	}



}

