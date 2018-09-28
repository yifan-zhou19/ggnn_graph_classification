package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int e;
		int m = 0;
		int[] sc = new int[N];
		int[] js = new int[N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 sc[i] = Integer.parseInt(tempVar2);
		 }
		}
		for (int k = 0;k < n;k++)
		{
			if (sc[k] % 2 != 0)
			{
				js[m] = sc[k];
				m++;
			}
		}
		m--;
		for (int d = 0;d < m;d++)
		{
			for (int b = 0;b < m - d;b++)
			{
			 if (js[b] > js[b + 1])
			 {
					 e = js[b + 1];
					 js[b + 1] = js[b];
					 js[b] = e;
			 }
			}
		}
		  for (int u = 0;u < m;u++)
		  {
				  System.out.printf("%d,",js[u]);
		  }
		  System.out.printf("%d",js[m]);
	   return 0;
	}

}

