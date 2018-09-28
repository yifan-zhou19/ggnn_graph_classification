package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int a;
		int b;
		int[] zongshu = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0;a < n;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				System.out.print("60\n");
				continue;
			}
			for (b = 1;b <= m;b++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					zongshu[b] = Integer.parseInt(tempVar3);
				}
			}
			for (int k = m;k >= 0;k--)
			{
				if ((zongshu[k] + 3 * k) <= 60)
				{
					System.out.printf("%d\n",60 - 3 * k);
					break;
				}
				else if ((zongshu[k] + 3 * k - 3) <= 60)
				{
					System.out.printf("%d\n",zongshu[k]);
					break;
				}
				else
				{
					continue;
				}
			}
		}
		return 0;

	}
}

