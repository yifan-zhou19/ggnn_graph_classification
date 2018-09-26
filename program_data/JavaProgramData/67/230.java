package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int[] sz1 = new int[100];
		int n;
		float[] sz2 = new float[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int x;
		int y;
		float z;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		z = (float)y / x;

		int i = 0;
		while (i < n - 1)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				(sz1[i]) = Integer.parseInt(tempVar5);
			}
			sz2[i] = (float)(sz1[i]) / (sz[i]);
			i++;
		}

		i = 0;
		while (i < n - 1)
		{
			if ((sz2[i] - z) > 0.05)
			{
				System.out.print("better\n");
			}
			else if ((z - sz2[i]) > 0.05)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
			i++;
		}

		return 0;

	}
}

