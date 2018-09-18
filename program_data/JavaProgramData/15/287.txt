package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[100][100];
		int x = 0;
		int y = 0;
		int s;
		int place;
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
			if (x == 0)
			{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					x++;
				}
			}
			}
			else
			{
				break;
			}
		}
		for (j = 0;j < n;j++)
		{
			if (y == 0)
			{
			for (i = 0;i < n;i++)

			{
				if (a[i][j] == 0)
				{

					y++;
				}
			}
			}

			else
			{
				break;
			}
		}

		s = (y - 2) * (x - 2);
		System.out.printf("%d",s);
	}

}

