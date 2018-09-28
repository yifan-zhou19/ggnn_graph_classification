package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int xpy;
		int stop;
		int[] js = new int[21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[(n + 1)];
		for (xpy = 1;xpy <= n;xpy++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (i = 1;i <= m;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					js[i] = Integer.parseInt(tempVar3);
				}
			}
			stop = 0;
			for (i = 1;i <= m;i++)
			{
				if (js[i] + i * 3 <= 60)
				{
					stop += 3;
				}
				else if (js[i] + (i - 1) * 3 <= 60)
				{
					stop += 60 - js[i] - (i - 1) * 3;
				}
				else
				{
				break;
				}
			}
			a[xpy] = 60 - stop;
		}
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			i = Integer.parseInt(tempVar4);
		}
		return 0;
	}
}

