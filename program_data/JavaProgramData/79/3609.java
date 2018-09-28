package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[1000];
		int[] n = new int[1000];
		int i;
		int j;
		int k;
		int s = 0;
		int d;
		int[] w = new int[1000];
		int c;
		int g;
		int f;
		int v;
		int e;
	   for (k = 0;;k++)
	   {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[k] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m[k] = Integer.parseInt(tempVar2);
		}
	   c = n[k] + 1;
		int[] a = new int[c];
		for (i = 0;i <= n[k];i++)
		{
		a[i] = 1;
		}
		j = 0;
		i = n[k] - 1;
		v = 0;
		while (v < n[k] - 1)
		{
			if (j == m[k])
			{
			  a[i] = 0;
			  j = 0;
			  v++;

			}
		 else
		 {
			 i++;
		 if (i == n[k])
		 {
		  i = i - n[k];
		 }
		  j = j + a[i];
		 }


		}
		 for (i = 0;i < n[k];i++)
		 {
		 if (a[i] == 1)
		 {
		 w[k] = i + 1;
		 }
		 }
		  g = n[k];
		  f = m[k];
		  if (g == 0 && f == 0)
		  {
			  e = k;
		  break;
		  }
	   }
		  for (k = 0;k < e;k++)
		  {
		 System.out.printf("%d\n",w[k]);
		  }
		System.in.read();
		 System.in.read();
	}

}

