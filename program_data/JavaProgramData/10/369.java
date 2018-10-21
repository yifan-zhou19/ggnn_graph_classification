package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[26];
		int i;
		int j;
		int k;
		int n = 25;
		int m = 0;
		int t;
		int[] d = new int[26];
		int[] f = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			d[i] = 1;
			f[i] = 1;
		}
		for (i = n - 1;i > 0;i--)
		{
		   for (k = i + 1;k <= n;k++)
		   {
			   if (a[i] >= a[k])
			   {
				   for (j = i + 1;j < n;j++)
				   {
					   if (a[i] >= a[j] != 0 && d[j] > f[k])
					   {
						   f[k] = d[j];
					   }
				   }
			   d[i] = d[i] + f[k];
			   break;
			   }
		   }
		}

		for (i = n;i > 0;i--)
		{
			if (d[i] > m)
			{
				m = d[i];
			}
		}
		System.out.printf("%d",m);

	}



}

