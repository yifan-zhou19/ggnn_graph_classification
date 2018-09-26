package <missing>;

public class GlobalMembers
{
	public static int fangpingguo(int m,int n)
	{
		int sum = 0;
		if (n == 1 || m == 0)
		{
			return 1;
		}
		if (m < n)
		{
			 sum = fangpingguo(m, n - 1);
		}
		if (m >= n)
		{
			 sum = fangpingguo(m, n - 1) + fangpingguo(m - n, n);
		}
		return sum;
	}
	public static int Main()
	{
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < t;i++)
		{

			int m;
			int n;
			int fang;
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
			fang = fangpingguo(m, n);
			System.out.printf("%d\n",fang);
		}
		return 0;
	}

}

