package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int exist = 0;
		int[] addressx = new int[10];
		int[] addressy = new int[10];
		int h;
		int k;
		int x;
		int y;
		int i = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		while (x >= 1)
		{
		  addressx[i] = x;

		  x = x / 2;
		  i += 1;
		}

		while (y >= 1)
		{
			addressy[j] = y;

			y = y / 2;
			j += 1;
		}

		for (h = 0;h <= i - 1;h++)
		{
			for (k = 0;k <= j - 1;k++)
			{
				if (addressx[h] == addressy[k])
				{
					System.out.printf("%d",addressx[h]);
					exist = 1;
					break;
				}
			}
			if (exist == 1)
			{
				break;
			}

		}
	}
}

