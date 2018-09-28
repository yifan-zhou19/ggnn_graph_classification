package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int time;
		int[] x = new int[20];
		int n;
		int i;
		int j;
		int k;
		int tmpa;
		int tmpb;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			tmpa = 0;
			tmpb = 0;
			time = 0;
			for (j = 0;j <= 19;j++)
			{
				x[j] = 0;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				time = Integer.parseInt(tempVar2);
			}
			if (time == 0)
			{
				System.out.print("60\n");
				continue;
			}
			else
			{
				for (j = 0;j <= time-1;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						x[j] = Integer.parseInt(tempVar3);
					}
				}
				for (j = 19;j >= 0;j--)
				{
					if (x[j] == 0)
					{
						continue;
					}
					if (x[j] + 3 * (20 - j) >= 60)
					{
						continue;
					}
					if (x[j] + 3 * (20 - j) < 60)
					{
						tmpb = 57 - (x[j] + 3 * (20 - j));
						tmpb += x[j];
						System.out.printf("%d\n",tmpb);
						break;
					}
				}
			}
		}
		return 0;
	}

}

