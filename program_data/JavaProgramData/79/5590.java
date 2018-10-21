package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int x;
		int e;
		int max;
		while (e == e)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (n == 0 && m == 0)
		{
			break;
		}
		int[] c = new int[n + 1];
		for (i = 1;i <= n;i++)
		{
			c[i] = i;
		}
		   x = n;
	for (i = 1;;)
	{
		 for (i = 1;i <= n;i++)
		 {
			if (c[i] % m != 0)
			{
			   x++;
			   c[i] = x;
			}
		 }
		max = 1;
		for (i = 1;i <= n;i++)
		{
		   if (c[i] > c[max])
		   {
			 max = i;
		   }
		}
		e = 0;
		for (i = 1;i <= n;i++)
		{
			if (c[i] % m == 0)
			{
				e = e+1;
			}
		}
		  if (e == n)
		  {
			  break;
		  }

	}
	System.out.printf("%d\n",max);
		}
	return 0;
	}




}

