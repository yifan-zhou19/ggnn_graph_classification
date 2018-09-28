package <missing>;

public class GlobalMembers
{
	public static int run(int n)
	{
		if (n % 4 == 0 && n % 100 != 0)
		{
			return 1;
		}
		else if (n % 400 == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			int y;
			int m1;
			int m2;
			int t;
			int day = 0;
			int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if (run(y) == 1)
			{
				a[1] = 29;
			}
			if (m1 > m2)
			{
				t = m1;
				m1 = m2;
				m2 = t;
			}
			for (int j = m1;j < m2;j++)
			{
				day += a[j - 1];
			}
			if (day % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
	}


}

