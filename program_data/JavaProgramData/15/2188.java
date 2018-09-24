package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag = 1;
		int[][] a = new int[100][100];
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
			a[i][j] = Integer.parseInt(tempVar2);
		}
		}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					flag = 0;
					break;
				}
			}
			if (flag == 0)
			{
				break;
			}
		}
		int length;
		int width;
		int x = 0;
		int y = 0;
		for (length = j;a[i][length] == 0;length++)
		{
			x++;
		}
		for (width = i;a[width][j] == 0;width++)
		{
			y++;
		}
		 int p;
		p = (x - 2) * (y - 2);
		System.out.printf("%d",p);
	}

}

