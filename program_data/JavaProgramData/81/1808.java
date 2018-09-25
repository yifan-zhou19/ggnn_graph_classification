package <missing>;

public class GlobalMembers
{
	public static int juzhen(int hang)
	{
		if (hang < 5 && hang >= 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}

	}

	public static int Main()
	{
		int temp;
		int[][] a = new int[5][5];
		int i;
		int j;
		int n;
		int m;

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (juzhen(n) != 0 && juzhen(m) != 0)
		{

			for (j = 0;j < 5;j++)
			{
				temp = a[n][j];
				a[n][j] = a[m][j];
				a[m][j] = temp;
			}
		}
		else
		{
			System.out.print("error\n");
			return 0;
		}

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",a[i][j]);

			}
			System.out.printf("%d\n",a[i][4]);
		}


		return 0;
	}

}

