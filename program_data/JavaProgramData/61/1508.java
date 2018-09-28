package <missing>;

public class GlobalMembers
{
	public static int F(int n)
	{
		int[] a = new int[100];
		int i;
		a[1] = 1;
		a[2] = 1;
		a[3] = 2;
		if (n > 3)
		{
		for (i = 3;i <= n;i++)
		{
		a[i] = a[i - 1] + a[i - 2];
		}
	return a[n];
		}

	if (n == 1 || n == 1)
	{
	return 1;
	}
	}
	public static int Main()
	{
	 int n;
	 int b;
	 int p;
	 int q;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		p = Integer.parseInt(tempVar);
	}
	for (q = 0;q < p;q++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 b = F(n);
	 System.out.printf("%d\n",b);
	}

	  return 0;
	}
}

