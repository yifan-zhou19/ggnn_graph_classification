package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] tumour = new int[256][256];
		int n;
		int i;
		int j;
		int x1 = -1;
		int y1;
		int x2 = -1;
		int y2;
		int s;
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
					tumour[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (tumour[i][j] != 0)
				{
					continue;
				}
				else
				{
				x1 = i;
				y1 = j;
				break;
				}
			}
			if (x1 >= 0)
			{
			break;
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j >= 0;j--)
			{
				if (tumour[i][j] != 0)
				{
					continue;
				}
				else
				{
				x2 = i;
				y2 = j;
				break;
				}
			}
			if (x2 >= 0)
			{
			break;
			}
		}
		s = (x2 - x1 - 1) * (y2 - y1 - 1);
		System.out.printf("%d\n",s);
		return 0;
	}
}

