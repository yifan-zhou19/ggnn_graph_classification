package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num = new int(int m, int n);
		int t;
		int i;
		int[] x = new int[100];
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= t;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 m = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 n = Integer.parseInt(tempVar3);
						 }
						 x[i] = num(m, n);
		}
		for (i = 1;i <= t;i++)
		{
						 System.out.printf("%d\n", x[i]);
		}

		return 0;
	}

	   public static int num(int m, int n)
	   {

		if (n == 1 || m == 0)
		{
		return 1;
		}
		else if (m < n)
		{
			 return num(m, m);
		}
		return num(m, n - 1) + num(m - n, n);
	   }
}

