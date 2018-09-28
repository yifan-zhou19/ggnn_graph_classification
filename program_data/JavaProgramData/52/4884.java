package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 void de(int x[],int n, int m);
		int n;
		int m;
		int i;
		int[] x = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= n - 1;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			x[i] = Integer.parseInt(tempVar3);
		}
		}
		de(x, n, m);
		System.out.printf("%d",x[0]);
		for (i = 1;i <= n - 1;i++)
		{
		System.out.printf(" %d",x[i]);
		}
	return 0;
	}
	public static void de(int[] x, int n, int m)
	{
		 int i;
		 for (i = 0;i <= n - m - 1;i++)
		 {
		 x[i + n] = x[i];
		 }
		 for (i = 0;i <= n - 1;i++)
		 {
		 x[i] = x[i + n - m];
		 }
	}

}

