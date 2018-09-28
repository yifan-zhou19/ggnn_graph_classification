package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int c;

	   if ((m >= n) && (n > 1))
	   {
			   c = f(m, n - 1) + f(m - n, n);
	   }
	   if (m == 0)
	   {
	   c = 1;
	   }
	   if (n == 1)
	   {
			   c = 1;
	   }
	   if (m < n)
	   {
			 c = f(m, m);
	   }
		return (c);
	}

	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int n;
		int i;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
		}


	   for (i = 0;i < n;i++)
	   {
	   c[i] = f(a[i], b[i]);
	   }

		for (i = 0;i < n;i++)
		{
		  if (i == 0)
		  {
		  System.out.printf("%d",c[i]);
		  }
		  else
		  {
		  System.out.printf("\n%d",c[i]);
		  }
		}
	   System.in.read();
		 System.in.read();
		  System.in.read();
	}

}

