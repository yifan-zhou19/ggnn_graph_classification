package <missing>;

public class GlobalMembers
{
	public static int f(int m, int n)

	{

		   if (m == 0 || n == 1)
		   {
			   return 1;
		   }

		   if (m < n)
		   {
			   return f(m, m);
		   }

		   return f(m, n - 1) + f(m - n, n);

	}
	public static int Main()
	{
		int t;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
		int m;
		int n;
		int k;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		k = f(m, n);
		System.out.printf("%d",k);
		   System.out.print("\n");
		}
		return 0;
	}
}

