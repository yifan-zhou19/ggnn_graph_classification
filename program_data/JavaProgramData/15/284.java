package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int s = 1;
		int m;
		int l;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (true)
		{
			i += 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a == 0)
			{
				break;
			}
		}
		m = i;
		while (true)
		{
			i += 1;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			if (a == 0)
			{
				s += 1;
			}
			if (a != 0)
			{
				break;
			}
		}
		l = i - 1;
		while (true)
		{
			i += 1;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Integer.parseInt(tempVar4);
			}
			if (a == 0)
			{
				s += 1;
			}
			if (i >= n * n)
			{
				break;
			}
		}
		System.out.printf("%d\n",((s - (l - m + 1) * 2) / 2) * (l - m - 1));

		return 0;

	}

}

