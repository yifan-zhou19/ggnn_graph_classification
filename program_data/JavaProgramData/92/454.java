package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int[] a = new int[1001];
		int[] b = new int[1001];
		int[][] f = new int[2][1001];
		int max;
		int ss = new int(int x,int y);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
		  for (i = 1;i <= n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Integer.parseInt(tempVar2);
			  }
		  }
		  for (i = 1;i <= n;i++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  b[i] = Integer.parseInt(tempVar3);
			  }
		  }
		  f[0][0] = 0;
		  for (i = 1;i < n;i++)
		  {
		for (j = i + 1;j <= n;j++)
		{
		  if (a[i] < a[j])
		  {
			t = a[i];
			a[i] = a[j];
			a[j] = t;
		  }
		}
		  }
		  for (i = 1;i < n;i++)
		  {
		for (j = i + 1;j <= n;j++)
		{
		  if (b[i] < b[j])
		  {
			t = b[i];
			b[i] = b[j];
			b[j] = t;
		  }
		}
		  }
		  f[0][0] = 0;
		  t = 0;
		  for (i = 1;i <= n;i++)
		  {
		t = 1 - t;
		f[t][0] = f[1 - t][0] + ss(a[n - i + 1], b[i]);
		f[t][i] = f[1 - t][i - 1] + ss(a[i], b[i]);
		for (j = 1;j < i;j++)
		{
		  if (f[1 - t][j - 1] + ss(a[j], b[i]) > f[1 - t][j] + ss(a[n - (i - j) + 1], b[i]))
		  {
			f[t][j] = f[1 - t][j - 1] + ss(a[j], b[i]);
		  }
		  else
		  {
			  f[t][j] = f[1 - t][j] + ss(a[n - (i - j) + 1], b[i]);
		  }
		}
		  }
		  max = f[t][0];
		  for (i = 1;i <= n;i++)
		  {
		 if (f[t][i] > max)
		 {
			 max = f[t][i];
		 }
		  }
		  System.out.printf("%ld\n",max);
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  n = Integer.parseInt(tempVar4);
		  }
		}
	}
	public static int ss(int x,int y)
	{
		if (x > y)
		{
			return (200);
		}
		else if (x == y)
		{
			return (0);
		}
		else
		{
			return (-200);
		}
	}
}

