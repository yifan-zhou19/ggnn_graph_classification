package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] f = new int[100];
		int[] h = new int[100];
		int m;
		int n;
		int b;
		int c;
		int d;
		int e;
		int g;
		int i;
		int j;
		i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			f + i = tempVar;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			h + i = tempVar2;
		}
		while (f[i] != 0 && h[i] != 0)
		{
			i++,scanf("%d%d",f + i,h + i);
		}


		g = 0;
		while (f[g] != 0 && h[g] != 0)
		{
			n = f[g];
		 m = h[g];
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			 a[i] = i + 1;
		}
		for (j = 0;j < n - 1;j++)
		{
		  b = m % (n - j);
		  if (b == 0)
		  {
			   b = n - j;
			   c = 0;
		  while (a[c] != b)
		  {
		   c++;
		  }
		   a[c] = 0;
		  }
		  else
		  {
		  c = 0;
		  while (a[c] != b)
		  {
		   c++;
		  }
		  a[c] = 0;
		  for (d = c + 1,i = 1;d < n;d++)
		  {
			if (a[d] != 0)
			{
				 a[d] = i;
				 i++;
			}
		  }
		  for (e = c - 1,i = n - j - 1;e >= 0;e--)
		  {
			if (a[e] != 0)
			{
				 a[e] = i;
				 i--;
			}
		  }
		  }
		}
		 i = 0;
		 while (a[i] != 1)
		 {
		   i++;
		 }
		System.out.printf("%d\n",i + 1);
		g++;
		}

	}

}

