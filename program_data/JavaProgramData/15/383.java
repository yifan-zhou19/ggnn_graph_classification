package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int x1;
		int y1;
		int x2;
		int y2;
		int[] a = new int[1000];
		int t;
		x1 = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[j] = Integer.parseInt(tempVar2);
				}
				if (a[j] == 0)
				{
					if (x1 == -1)
					{
						x1 = i;
						y1 = j;
					}
					x2 = i;
					y2 = j;

				}

			}
		}
			t = (x2 - x1 - 1) * (y2 - y1 - 1);
		System.out.printf("%d\n",t);
		return 0;
	}

}

