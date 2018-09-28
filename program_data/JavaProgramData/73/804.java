package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int max = 0;
		int[][] address = new int[5][2];
		int exist1 = 0;
		int exist2 = 0;
		for (i = 1;i <= 5;i++)
		{
			max = 0;
			for (j = 1;j <= 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i - 1][j - 1] = Integer.parseInt(tempVar);
				}
				if (a[i - 1][j - 1] > max)
				{
				 max = a[i - 1][j - 1];
				 address[i - 1][0] = i - 1;
				 address[i - 1][1] = j - 1;

				}
			}

		}

		for (i = 1;i <= 5;i++)
		{
			int hang;
			int lie;
			for (j = 1;j <= 5;j++)
			{
				hang = address[i - 1][0];
				lie = address[i - 1][1];
				if (a[j - 1][lie] < a[hang][lie])
				{
					 exist1 = 1;
				}
			}
			if (exist1 == 0)
			{
				System.out.printf("%d %d %d",hang + 1,lie+1,a[hang][lie]);
				exist2 = 1;
			}
			exist1 = 0;
		}
		if (exist2 == 0)
		{
			System.out.printf("%s","not found");
		}
		System.in.read();
	return 0;
	}
}

