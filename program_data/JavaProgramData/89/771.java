package <missing>;

public class GlobalMembers
{
	// ??????.cpp : Defines the entry point for the console application.
	//


	public static void Main(String[] args)
	{
		int i;
		int j;
		int n;
		int hang = 1;
		int[][] sz = new int[10000][2];
		int renshita;
		int tarenshi;
		int mingliu = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[0][0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz[0][1] = Integer.parseInt(tempVar3);
		}
		while (sz[i][0] != 0 || sz[i][1] != 0)
		{
			i++;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				sz[i][0] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar5);
			}
			hang++;
		}
		for (j = 0;j < n;j++)
		{
			renshita = 0;
			tarenshi = 0;
			for (i = 0;i < hang;i++)
			{
				if (sz[i][1] == j)
				{
					renshita++;
				}
			}
			for (i = 0;i < hang - 1;i++)
			{
				if (sz[i][0] == j)
				{
					tarenshi++;
				}
			}
			if (renshita == n - 1 && tarenshi == 0)
			{
				System.out.printf("%d\n",j);
				mingliu++;
			}
		}
		if (mingliu == 0)
		{
			System.out.print("NOT FOUND");
		}
	}

}

