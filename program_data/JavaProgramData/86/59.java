package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[100][60];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Integer.parseInt(tempVar2);
			}
			for (j = 1; j <= a[i][0]; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
			int num = 60;
			if (a[i][0] == 0)
			{
				System.out.print("60\n");
			}
			for (j = a[i][0]; j >= 1; j--)
			{
				if (a[i][j] + j * 3 <= 60)
				{
					System.out.printf("%d\n", 60 - j * 3);
					break;
				}
				else if (a[i][j] + j * 3 <= 63)
				{
					System.out.printf("%d\n", 60 - (j - 1) * 3 - 63 + a[i][j] + j * 3);
					break;
				}
			}
		}
		return 0;
	}


}

