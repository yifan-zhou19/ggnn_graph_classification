package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int j;
		int d;
		int[][] b = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i][0] = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= b[i][0];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			if (b[i][0] == 0)
			{
				System.out.print("60\n");
			}
			else
			{
			d = 0;
			for (j = 1;j <= b[i][0];j++)
			{
				d = d + 3;
				if (b[i][j] + d >= 60)
				{
					break;
				}
			}
			if (j - 1 == b[i][0])
			{
				System.out.printf("%d\n",60 - d);
			}
			else if (b[i][j] + d - 60 <= 3)
			{
				System.out.printf("%d\n",b[i][j]);
			}
			else if (b[i][j] + d - 60 > 3)
			{
				System.out.printf("%d\n",60 - d + 3);
			}
			}
		}



		return 0;
	}


}

