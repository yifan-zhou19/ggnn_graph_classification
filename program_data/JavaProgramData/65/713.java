package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int n;
		int m;
		int[] x = new int[200];
		int[] y = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(x[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(y[i]) = Integer.parseInt(tempVar3);
			}
		}
	a = 0;
	b = 0;
		for (i = 0;i <= n - 1;i++)
		{
			m = x[i] - y[i];
			if (m == -1 || m == 2)
			{
				a++;
			}
			if (m == 1 || m == -2)
			{
				b++;
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		if (a < b)
		{
			System.out.print("B");
		}
		return 0;
	}
}

