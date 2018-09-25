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
		int i = 1;
		int m = 0;
		int max = 0;
		while (i <= n)
		{
			int s;
			int z;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				z = Integer.parseInt(tempVar3);
			}
			if (s >= 90 && s <= 140 && z <= 90 && z >= 60)
			{
				m = m + 1;
			}
			else
			{
				if (max > m)
				{
					max = max;

				}
				else
				{
					max = m;
				}
				m = 0;
			}
			i = i + 1;
		}
		if (max > m)
		{
					max = max;

		}
				else
				{
					max = m;
				}
		System.out.printf("%d",max);
	return 0;
	}

}

