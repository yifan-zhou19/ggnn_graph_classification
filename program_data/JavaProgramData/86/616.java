package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[100][50];
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
				a[i][0] = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= a[i][0];j++)
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
			if (a[i][0] == 0)
			{
				System.out.print("60\n");
			}
			else
			{
			for (j = 1;j <= a[i][0] != 0 && a[i][j] + j * 3 - 3 <= 60;j++)
			{
				;
			}
			j--;
			if (60 - a[i][j] - j * 3 <= 3)
			{
				System.out.printf("%d\n",a[i][j]);
			}
				else
				{
					System.out.printf("%d\n",60 - j * 3);
				}
			}
		}
	}

}

