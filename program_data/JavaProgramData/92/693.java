package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int n;
	  int i;
	  int j;
	  int k;
	  int p;
	  int q;
	  int r;
	  int s;
	  int t;
	  int u;
	  int w;
	  int x;
	  int[] a = new int[1000];
	  int[] b = new int[1000];
	  int[] c = new int[1000];
	  int v = 0;
	  do
	  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i <= m - 1;i++)
		  {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		  }
		  for (j = 0;j <= m - 1;j++)
		  {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[j] = Integer.parseInt(tempVar3);
			}
		  }
		  for (k = 0;k <= m - 1;k++)
		  {
			  for (p = 0;p <= m - 2 - k;p++)
			  {
				if (a[p] < a[p + 1])
				{
				  u = a[p + 1];
				  a[p + 1] = a[p];
				  a[p] = u;
				}
			  }
		  }
		  for (s = 0;s <= m - 1;s++)
		  {
			  for (t = 0;t <= m - 2 - s;t++)
			  {
				if (b[t] < b[t + 1])
				{
				  u = b[t + 1];
				  b[t + 1] = b[t];
				  b[t] = u;
				}
			  }
		  }

		  for (n = 0;n <= m - 1;n++)
		  {
			for (p = 0;p <= m - 1 - n;p++)
			{
			  c[n + p] = a[p];
			}
			for (r = 0;r <= n - 1;r++)
			{
			 c[r] = a[p + r];
			}

			for (q = 0;q <= m - 1;q++)
			{
			 if (b[q] > c[q])
			 {
			 v = v - 200;
			 }
			 else if (b[q] < c[q])
			 {
			 v = v + 200;
			 }

			}
			if (n != 0 && v > w)
			{
			w = v;
			}
			else if (n == 0)
			{
			w = v;
			}
			else if (n == (m - 1) / 2 + 1)
			{
			break;
			}
			v = 0;
		  }
		  if (m != 0)
		  {
		  System.out.printf("%d\n",w);
		  }
		  v = 0;
	  } while (m != 0);
	}
}

