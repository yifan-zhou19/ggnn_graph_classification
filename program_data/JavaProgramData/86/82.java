package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int m;
		int j;
		int p;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			int time = 0;
			for (j = 1;j <= m;j++)
			{
				if (time < 60)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						p = Integer.parseInt(tempVar3);
					}
					time = p + 3 * j;
				}
				if (time >= 60)
				{
					break;
				}
			}
			if (time <= 60)
			{
				System.out.printf("%d\n",60 - 3 * m);
			}
			if (time > 60)
			{
				if (p < (60 - 3 * (j - 2)))
				{
					System.out.printf("%d\n",p);
				}
				if (p >= (60 - 3 * (j - 2)))
				{
					System.out.printf("%d\n",60 - 3 * (j - 1));
				}
			}
		}

		return 0;
	}
}

