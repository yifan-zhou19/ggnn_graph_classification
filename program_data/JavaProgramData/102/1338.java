package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c = 0;
		int d = 0;
		int e;
		int f;
		int g;
		int h;
		int i;
		int[] a = new int[40];
		int[] a1 = new int[40];
		int[] b = new int[40];
		int[] b1 = new int[40];
		String gender = new String(new char[7]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;d + c <= n - 1;)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			gender = tempVar2.charAt(0);
		}
		if (gender.charAt(0) == 'm')
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a1[c] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(".");
			if (tempVar4 != null)
			{
				a[c] = Integer.parseInt(tempVar4);
			}
		 c++;
		}
	   else
	   {
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b1[d] = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(".");
			if (tempVar6 != null)
			{
				b[d] = Integer.parseInt(tempVar6);
			}
		 d++;
	   }
		}
		for (e = 0;e <= c - 2;e++)
		{
		   for (f = e+1;f <= c - 1;f++)
		   {
			if (a1[e] > a1[f])
			{
				g = a[e];
				a[e] = a[f];
				a[f] = g;
				g = a1[e];
				a1[e] = a1[f];
				a1[f] = g;
			}
			else
			{
			 if (a1[e] == a1[f] && a[e] > a[f])
			 {
				  g = a[e];
				  a[e] = a[f];
				  a[f] = g;
				  g = a1[e];
				  a1[e] = a1[f];
				  a1[f] = g;
			 }
			 else
			 {
				 ;
			 }
			}
		   }
		}
		for (e = 0;e <= d - 2;e++)
		{
		   for (f = e+1;f <= d - 1;f++)
		   {
			if (b1[e] < b1[f])
			{
				g = b[e];
				b[e] = b[f];
				b[f] = g;
				g = b1[e];
				b1[e] = b1[f];
				b1[f] = g;
			}
			else
			{
			 if (b1[e] == b1[f] && b[e] < b[f])
			 {
				 g = b[e];
				 b[e] = b[f];
				 b[f] = g;
				 g = b1[e];
				 b1[e] = b1[f];
				 b1[f] = g;
			 }
			 else
			 {
				 ;
			 }
			}
		   }
		}
	  // printf("%d %d %d\n",c,d,n);

		for (e = 0;e <= c - 1;e++)
		{
		if (a[e] >= 10)
		{
		System.out.printf("%d.%d ",a1[e],a[e]);
		}
		else
		{
		System.out.printf("%d.0%d ",a1[e],a[e]);
		}
		}
		for (e = 0;e <= d - 2;e++)
		{
		if (b[e] >= 10)
		{
		System.out.printf("%d.%d ",b1[e],b[e]);
		}
		else
		{
		System.out.printf("%d.0%d ",b1[e],b[e]);
		}

		}

	if (b[e] >= 10)
	{
		System.out.printf("%d.%d\n",b1[e],b[e]);
	}
		else
		{
		System.out.printf("%d.0%d\n",b1[e],b[e]);
		}

	}
}

