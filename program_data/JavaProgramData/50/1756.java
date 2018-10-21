package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int a;
		int b;
		int i;
		int[] sz = new int[12];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		sz[0] = 13;
		sz[1] = 44;
		sz[2] = 72;
		sz[3] = 103;
		sz[4] = 133;
		sz[5] = 164;
		sz[6] = 194;
		sz[7] = 225;
		sz[8] = 256;
		sz[9] = 286;
		sz[10] = 317;
		sz[11] = 347;
		for (i = 0;i < 12;i++)
		{
			a = (sz[i] - 1) % 7 + w;
			b = a % 7;
			if (b == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
		return 0;
	}

}

