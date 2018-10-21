package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[500];
		int[] zs = new int[500];
		int n;
		int i;
		int x = 0;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		if (sz[i] % 2 != 0)
		{
			zs[x] = sz[i];
			x++;
		}
		}
		for (i = 0;i < x - 1;i++)
		{
			if (zs[i] > zs[i + 1])
			{
			c = zs[i + 1];
			zs[i + 1] = zs[i];
			zs[i] = c;
			if (i != 0)
			{
				i = i - 2;
			}
			}
		}
		for (i = 0;i < x;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",zs[i]);
			}
			else
			{

				System.out.printf(",%d",zs[i]);
			}

		}



	return 0;
	}
}

