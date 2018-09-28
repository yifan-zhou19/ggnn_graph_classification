package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			int j;
			int count = 0;
			int time = 0;
			int duan;
			int[] sz = new int[30];
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				duan = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < duan;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[j] = Integer.parseInt(tempVar3);
				}
			}
			if (duan == 0)
			{
				System.out.print("60\n");
			}
			else if (duan == 1)
			{
				if (sz[0] > 57)
				{
					System.out.printf("%d\n",sz[0]);
				}
				else
				{
					System.out.print("57\n");
				}
			}
			else
			{
				count = sz[duan - 3];
				time = count + 3 * (duan - 3);
				time = time+3;
				if (sz[duan - 2] + (duan - 2) * 3 < 60)
				{
					count = sz[duan - 2];
					time = count + (duan - 1) * 3;
					if (sz[duan - 1] + (duan - 1) * 3 < 60)
					{
						count = sz[duan - 1];
						time = count + (duan) * 3;
						while (time < 60)
						{
							count++;
							time++;
						}
					}
					else
					{
						while (time < 60)
						{
							count++;
							time++;
						}
					}
				}
				else
				{
					while (time < 60)
					{
						count++;
						time++;
					}
				}
				System.out.printf("%d\n",count);
			}
		}
		return 0;
	}
}

