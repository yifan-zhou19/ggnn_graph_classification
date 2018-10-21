package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] time = new int[50];
		int[][] a = new int[50][100];
		for (i = 0;i < n;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				time[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < time[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}

		}
		for (i = 0;i < n;i++)
		{
			if (time[i] == 0)
			{
				System.out.print("60");
			}
			else if (a[i][time[i] - 1] <= 60 - 3 * time[i])
			{
				System.out.printf("%d",60 - 3 * time[i]);
			}
			else
			{
				for (j = 0;j < time[i];j++)
				{
					if (a[i][j] < 60 - (j + 1) * 3 && a[i][j + 1]>60 - (j + 2) * 3)
					{
						if (60 - (j + 1) * 3 >= a[i][j + 1])
						{
							System.out.printf("%d",a[i][j + 1]);
						}
						else
						{
							System.out.printf("%d",60 - (j + 1) * 3);
						}
					}
				}
			}
				System.out.print("\n");
		}
		return 0;
	}
}

