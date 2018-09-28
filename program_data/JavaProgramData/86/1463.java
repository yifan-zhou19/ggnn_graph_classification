package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int[] x = new int[110];
		int ctr;
		int time;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			ctr = 0;
			time = 0;
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
					x[i] = Integer.parseInt(tempVar3);
				}
				if (time + x[i] - ctr <= 60)
				{
					time += x[i] - ctr + 3;
					ctr = x[i];
				}
			}
			if (time < 60)
			{
				ctr += 60 - time;
			}
			System.out.printf("%d\n",ctr);
		}
		return 0;
	}
}

