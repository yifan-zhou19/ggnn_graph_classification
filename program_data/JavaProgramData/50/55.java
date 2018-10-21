package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {0, 13, 44, 72, 103, 133, 164, 194, 225, 256, 286, 317, 347};
		int[] b = new int[13];
		int w;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= 12; i++)
		{
			b[i] = a[i] % 7;
		}

		if (w != 7)
		{
			for (i = 1;i <= 12; i++)
			{
				if (b[i] == 6 - w)
				{
					System.out.printf("%d\n",i);
				}
			}
		}

		if (w == 7)
		{
			for (i = 1; i <= 12; i++)
			{
				if (b[i] == 6)
				{
					System.out.printf("%d\n",i);
				}
			}

		}
		return 0;
	}
}

