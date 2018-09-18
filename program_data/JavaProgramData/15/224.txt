package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x0;
		int y0;
		int x1;
		int y1;
		int pixel;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n * n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pixel = Integer.parseInt(tempVar2);
			}
			if (pixel == 0)
			{
				x0 = i / n;
				y0 = i % n;
				break;
			}
		}
		for (i = i + 1; i < n * n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pixel = Integer.parseInt(tempVar3);
			}
			if (pixel == 0)
			{
				x1 = i / n;
				y1 = i % n;
			}

		}

		System.out.printf("%d\n", (x1 - x0 - 1) * (y1 - y0 - 1));

		return 0;
	}

}

