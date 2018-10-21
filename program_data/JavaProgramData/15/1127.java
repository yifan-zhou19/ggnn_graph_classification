package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int n;
		int i;
		int j;
		int t;
		int area;
		int status = 0;
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
					t = Integer.parseInt(tempVar2);
				}
				if (t == 0)
				{
					if (status == 0)
					{
						x1 = i;
						y1 = j;
						status = 1;
					}
					x2 = i;
					y2 = j;
				}
			}
		}
			area = (x2 - x1 - 1) * (y2 - y1 - 1);
			System.out.printf("%d",area);
			return 0;
	}
}

