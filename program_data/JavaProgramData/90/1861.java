package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int t;
		int method = new int(int n,int m);

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
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",method(n, m));
		}

		return 0;
	}
	public static int method(int n,int m)
	{
		int sum = 0;
		if (n == 1 || m == 1 || m == 0)
		{
			return 1;
		}
		else if (n > m)
		{
			sum += method(n - 1, m);
		}
		else
		{
			sum += method(n - 1, m) + method(n, m - n);
		}
		return sum;
	}

}

