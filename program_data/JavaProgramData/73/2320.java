package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int h;
	int z;
	int s;
	s = 0;
	int[][] sz = new int[5][5];
	int[] max = new int[5];
	int[] min = new int[5];
	for (h = 0;h < 5;h++)
	{
		for (z = 0;z < 5;z++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sz[h][z] = Integer.parseInt(tempVar);
			}
		}
	}
	for (h = 0;h < 5;h++)
	{
	max[h] = sz[h][0];
	for (z = 0;z < 5;z++)
	{
		if (sz[h][z] > max[h])
		{
			max[h] = sz[h][z];
		}
	}
	}
	for (z = 0;z < 5;z++)
	{
		min[z] = sz[0][z];
			for (h = 0;h < 5;h++)
			{
				if (sz[h][z] < min[z])
				{
				min[z] = sz[h][z];
				}
			}
	}
	for (h = 0;h < 5;h++)
	{
	for (z = 0;z < 5;z++)
	{
		if (min[z] == max[h])
		{
				System.out.printf("%d %d %d",h + 1,z + 1,max[h]);
					s++;
		}
	}
	}
	if (s == 0)
	{
	System.out.print("not found");
	}
	return 0;
	}
}

