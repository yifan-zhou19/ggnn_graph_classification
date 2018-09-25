package <missing>;

public class GlobalMembers
{
	// ?????.cpp : ??????????????
	//



	public static int Main()
	{ //declaration
		short apple = new short(int m,int n);
		int t;
		int m;
		int n;
		int[] k = new int[20];
		int i;
	//input process
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= t - 1;i++)
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
			k[i] = apple(m, n);

		}
	//output
		for (i = 0;i <= t - 1;i++)
		{
			System.out.printf("%d\n",k[i]);
		}

		return 0;
	}

	public static short apple(int m,int n)
	{
		short res = 0;
		if (m <= 1 || n <= 1)
		{
			res = 1;
		}
		else
		{
			if (m >= n)
			{
				res = apple(m - n, n);
			}
			res = res + apple(m, n - 1);
		}
		return res;

	}
}

