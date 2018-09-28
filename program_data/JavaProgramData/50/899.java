package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int[] y = new int[12];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		y[0] = x + 12 % 7;
		y[1] = x + 43 % 7;
		y[2] = x + 71 % 7;
		y[3] = x + 102 % 7;
		y[4] = x + 132 % 7;
		y[5] = x + 163 % 7;
		y[6] = x + 193 % 7;
		y[7] = x + 224 % 7;
		y[8] = x + 255 % 7;
		y[9] = x + 285 % 7;
		y[10] = x + 316 % 7;
		y[11] = x + 346 % 7;
		for (i = 0;i <= 11;i++)
		{
			if (y[i] > 7)
			{
				y[i] = y[i] % 7;
			}
		}
		for (i = 0;i <= 11;i++)
		{
			if (y[i] == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}

		return 0;
	}
}

