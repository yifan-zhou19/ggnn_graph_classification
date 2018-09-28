package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int ss;
		int sz;
		int i;
		int[] sc = new int[100];
		int e;
		int k;
		for (i = 0;i < 100;i++)
		{
			sc[i] = 0;
		}
		e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ss = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz = Integer.parseInt(tempVar3);
			}
			if ((ss >= 90) && (ss <= 140) && (sz >= 60) && (sz <= 90))
			{
				sc[e]++;
			}
			else
			{
				e++;
			}
		}
		for (e = 0;e < 100;e++)
		{
			for (i = 0;i < 99;i++)
			{
				if (sc[i] < sc[i + 1])
				{
					k = sc[i];
					sc[i] = sc[i + 1];
					sc[i + 1] = k;
				}
			}
		}
		System.out.printf("%d",sc[0]);
		return 0;
	}

}

