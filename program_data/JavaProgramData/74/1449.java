package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int s = 0;
		int v;
		int j;
		int k;
		int sum = 0;
		double h;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (j = m;j <= n;j = j + 1)
		{
		  v = 1;
		  sum = 0;
		  for (i = 0;;i++)
		  {
			  h = Math.pow(10,(double)i);
			  if ((int)j / (int)h == 0)
			  {
				  break;
			  }
		  }
		  for (k = 0;k < i;k++)
		  {
			  h = Math.pow(10,(double)k);
			  a[v] = (int)j / (int)h;
			  v++;
		  }
		  for (k = 1;k < i;k++)
		  {
			  b[k] = a[k] - a[k + 1] * 10;
		  }
		  b[k] = a[k];
		  for (k = i;k >= 1;k = k - 1)
		  {
			  h = Math.pow(10,(double)(i - k));
			  sum = sum + b[k] * (int)h;
		  }
		  if (sum == j)
		  {
			for (k = 2;j > k && j % k != 0;k = k + 1)
			{
				;
			}
			if (k == j)
			{
				s = s + 1;
				if (s == 1)
				{
					System.out.printf("%d",sum);
				}
				else
				{
					System.out.printf(",%d",sum);
				}
			}
		  }
		}
		if (s == 0)
		{
			System.out.print("no");
		}
		return 0;
	}
}

