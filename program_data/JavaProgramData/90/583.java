package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int m,int n);
		int[] a = new int[20];
		int[] b = new int[20];
		int t;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
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
		for (i = 0;i < t;i++)
		{
			System.out.printf("%d\n",f(a[i], b[i]));
		}
		return 0;
	}
		public static int f(int m,int n)
		{
		 int c;
		if (m != 1 && n == 1)
		{
			c = 1;
		}
		else if (m == 1 && n != 1)
		{
			c = 1;
		}
		  else if (m == 1 && n == 1)
		  {
			  c = 1;
		  }
		  else if (m > n)
		  {
			  c = f(m - n, n) + f(m, n - 1);
		  }
		  else if (m == n)
		  {
			  c = 1 + f(m, n - 1);
		  }
		  else if (m < n)
		  {
			  c = f(m, m);
		  }
		 return (c);
		}


}

