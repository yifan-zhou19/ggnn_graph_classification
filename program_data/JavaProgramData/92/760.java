package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int jud = new int(int x[1000],int y[1000],int m);
		int n;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		int i = 0;
		int j;
		int re;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			for (j = 0;j < n;j++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
			}
			for (j = 0;j < n;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[j] = Integer.parseInt(tempVar3);
			}
			}
			c[i] = jud(b, a, n);
			i++;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
		}
		for (j = 0;j < i;j++)
		{
			 System.out.printf("%d\n",c[j]);
		}

	}

	public static int jud(int[] x, int[] y, int m)
	{
		int s;
		int i;
		int j;
		void arrange(int p[1000],int k);
		int result = new int(int a[1000],int b[1000],int n,int i);
		arrange(x, m);
		arrange(y, m);
		s = result(x, y, m, 0);
		for (i = 1;i < m;i++)
		{
			j = result(x, y, m, i);
			if (s < j)
			{
				s = j;
			}
		}
		return (s);
	}

	public static void arrange(int[] p, int k)
	{
		int i;
		int j;
		int mid;
		for (i = 0;i < k;i++)
		{
		   for (j = i + 1;j < k;j++)
		   {
				  if (p[i] < p[j])
				  {
					  mid = p[i];
					  p[i] = p[j];
					  p[j] = mid;
				  }
		   }
		}
	}

	public static int result(int[] a, int[] b, int n, int i)
	{
		int p;
		int q;
		int s = 0;
		for (p = 0;p < n;p++)
		{
				  q = p + i;
				if (q >= n)
				{
					q = q - n;
				}
				if (a[p] > b[q])
				{
					s = s - 200;
				}
				 else if (a[p] < b[q])
				 {
					 s = s + 200;
				 }
		}
		   return (s);
	}
}

