package <missing>;

public class GlobalMembers
{
	public static int n;
	public static void count(int x,int y)
	{
		int i;
		if (x == 1)
		{
			n = n + 1;
		}
		else
		{
			for (i = y;i <= x;i++)
			{
				if (x % i == 0)
				{
					count(x / i, i);
				}
			}
		}
	}
	public static int Main()
	{
		int i;
		int k;
		int t;
		void count(int x,int y);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			n = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
			count(t, 2);
			System.out.printf("%d\n",n);
		}
		return 0;
	}
}

