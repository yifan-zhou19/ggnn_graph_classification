package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int w;
		int[] xq = new int[13];
		n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		n += w - 1;
		xq[1] = 13;
		xq[2] = 31 + 13;
		xq[3] = 31 + 28 + 13;
		xq[4] = 31 + 28 + 31 + 13;
		xq[5] = 31 + 28 + 31 + 30 + 13;
		xq[6] = 31 + 28 + 31 + 30 + 31 + 13;
		xq[7] = 31 + 28 + 31 + 30 + 31 + 30 + 13;
		xq[8] = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 13;
		xq[9] = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 13;
		xq[10] = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 13;
		xq[11] = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 13;
		xq[12] = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 13;
		for (i = 1;i < 13;i++)
		{
			xq[i] += n;
			if (xq[i] % 7 == 5)
			{
				System.out.printf("%d\n",i);
			}
		}
		return 0;
	}


}

