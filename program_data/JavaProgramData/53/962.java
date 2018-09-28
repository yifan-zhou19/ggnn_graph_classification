package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int o;
		int[] a = new int[300];
		int[] b = new int[300];
		int[] c = new int[300];
		int m = 0;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
		}
		for (i = 0;i < n - 1;i++)
		{
			for (k = 1;k < n - i;k++)
			{
				if (a[i] == a[i + k])
				{
				  b[m] = i + k;
				  m++;
				}
				else
				{
					continue;
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			 int s = 1;
			 for (j = 0;j < m;j++)
			 {
				if (i == b[j])
				{
					s = 0;
				}
				else
				{
					continue;
				}
			 }
			 if (s == 1)
			 {
				c[p] = a[i];
				p++;
			 }
			 else
			 {
				 continue;
			 }
		}
		for (o = 0;o < p - 1;o++)
		{
			System.out.printf("%d,",c[o]);
		}
		System.out.printf("%d",c[p - 1]);
		return 0;
	}
}

