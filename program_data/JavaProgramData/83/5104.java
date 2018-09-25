package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int[] core = new int[10];
		int[] j = new int[10];
		int k;
		String o = new String(new char[10]);
		int all = 0;
		int alle = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= k - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				j[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 0;i <= k - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				core[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i <= k - 1;i++)
		{
			if (core[i] <= 100 && core[i] >= 90)
			{
					core[i] = 40;
					continue;
			}
			if (core[i] <= 89 && core[i] >= 85)
			{
					core[i] = 37;
					continue;
			}
			if (core[i] <= 84 && core[i] >= 82)
			{
				   core[i] = 33;
				   continue;
			}
			if (core[i] <= 81 && core[i] >= 78)
			{
				   core[i] = 30;
				   continue;
			}
			if (core[i] <= 77 && core[i] >= 75)
			{
				   core[i] = 27;
				   continue;
			}
			if (core[i] <= 74 && core[i] >= 72)
			{
				   core[i] = 23;
				   continue;
			}
			if (core[i] <= 71 && core[i] >= 68)
			{
				   core[i] = 20;
				   continue;
			}
			if (core[i] <= 67 && core[i] >= 64)
			{
				   core[i] = 15;
				   continue;
			}
			if (core[i] <= 63 && core[i] >= 60)
			{
				   core[i] = 10;
				   continue;
			}
			if (core[i] <= 59 && core[i] >= 0)
			{
					core[i] = 0;
					continue;
			}
		}

		for (i = 0;i <= k - 1;i++)
		{
			alle = alle + core[i] * j[i];
		}

		for (i = 0;i <= k - 1;i++)
		{
				all = all + j[i];
		}

			System.out.printf("%.2lf",1.0 * alle / 10 / all);


	return 0;
	}


}

