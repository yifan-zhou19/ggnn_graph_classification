package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[200][2];
		int i;
		int j;
		int x = 0;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
			if ((a[i][0] == 0 && a[i][1] == 1) || (a[i][0] == 1 && a[i][1] == 2) || (a[i][0] == 2 && a[i][1] == 0))
			{
				x++;
			}
			else if (a[i][0] == a[i][1])
			{
				y++;
			}
		}

			if (x * 2 == (n - y))
			{
				System.out.print("Tie");
			}
			else if (x * 2 < (n - y))
			{
				System.out.print("B");
			}
			else
			{
				System.out.print("A");
			}


		return 0;
	}
}

