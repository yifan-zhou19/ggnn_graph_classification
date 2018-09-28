package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int[][] shuzu = new int[100][100];
		int hang = 0;
		int lie = 0;
		int zu = 0;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zu = Integer.parseInt(tempVar);
		}
		for (i = 0;i < zu;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				hang = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				lie = Integer.parseInt(tempVar3);
			}
			sum = 0;
			for (j = 0;j < hang;j++)
			{
				for (k = 0;k < lie;k++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						shuzu[j][k] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (k = 0;k < lie;k++)
			{
				sum = sum + shuzu[0][k];
			}
			if (hang > 1)
			{
				for (k = 0;k < lie;k++)
				{
					sum = sum + shuzu[hang - 1][k];
				}
			}
			if (hang > 2)
			{
				for (k = 1;k < hang - 1;k++)
				{
					sum = sum + shuzu[k][0];
				}
			}
			if (lie > 1 && hang > 2)
			{
				for (k = 1;k < hang - 1;k++)
				{
					sum = sum + shuzu[k][lie-1];
				}
			}
			System.out.printf("%d\n",sum);

		}
		return 0;
	}






}

