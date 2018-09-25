package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int h;
		int z;
		int[][] a = new int[100][100];
		int x;
		int a1;
		int b1;
		int a2;
		int b2;
		int br = 1;
		int s;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (z = 1;z <= n;z++)
		{
			for (h = 1;h <= n;h++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[h][z] = Integer.parseInt(tempVar2);
				}

			}
		}



		for (z = 1;z <= n;z++)
		{
			for (h = 1;h <= n;h++)
			{
				if (a[h][z] == 0)
				{
				   a1 = h;
				   b1 = z;
				   br = 0;
				   break;
				}

			}
			if (br == 0)
			{
				break;
			}
		}


		for (z = 1;z <= n;z++)
		{
			for (h = 1;h <= n;h++)
			{
				if (a[h][z] == 0 && a[h - 1][z] == 0 && a[h][z - 1] == 0)
				{
				   a2 = h;
				   b2 = z;

				}

			}

		}


		s = (a2 - a1 - 1) * (b2 - b1 - 1);
		System.out.printf("%d\n",s);
		return 0;
	}
}

