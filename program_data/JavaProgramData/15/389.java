package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a;
		int b;
		int n;
		int x = 0;
		int y = 0;
		int l1;
		int l2;
		int q1;
		int q2;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n * n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a == 0)
			{
				x = i;
				break;
			}
		}
		for (j = 1;j <= n * n - x;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (b == 0)
			{
				y = x + j;
			}
		}
		l1 = x / n + 1;
		if (x % n != 0)
		{
			l1 = x / n + 1;
			q1 = x % n;
		}
		else
		{
			l1 = x / n;
			q1 = n;
		}
		if (y % n != 0)
		{
			l2 = y / n + 1;
			q2 = y % n;
		}
		else
		{
			l2 = y / n;
			q2 = n;
		}
		s = (l2 - l1 - 1) * (q2 - q1 - 1);
		System.out.printf("%d",s);
		return 0;
	}
}

