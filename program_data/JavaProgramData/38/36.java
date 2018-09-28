package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int group;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			group = Integer.parseInt(tempVar);
		}

		int i;
		for (i = 0;i < group;i++)
		{
			int num;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}

			double[] sz = new double[num];
			int j;
			for (j = 0;j < num;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[j] = Double.parseDouble(tempVar3);
				}
			}
			double sum = 0;
			for (j = 0;j < num;j++)
			{
				sum = sum + sz[j];
			}
			double aver;
			aver = sum / num;
			double mid = 0;
			for (j = 0;j < num;j++)
			{
				mid = mid + (sz[j] - aver) * (sz[j] - aver);
			}
			double re;
			re = Math.sqrt(mid / num);

			System.out.printf("%.5lf\n",re);

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(sz);

		}
		return 0;
	}
}

