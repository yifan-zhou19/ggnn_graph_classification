package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int hang;
		int lie;
		int[][] shuzu = new int[8][8];
		int i;
		int j;
		int k;
		int flag1;
		int flag2;
		int flag3 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			hang = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			lie = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < hang;i++)
		{
			for (j = 0;j < lie;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					shuzu[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < hang;i++)
		{
			for (j = 0;j < lie;j++)
			{
				flag1 = 0;
				flag2 = 0;
				for (k = 0;k < lie;k++)
				{
					if (shuzu[i][j] < shuzu[i][k])
					{
						flag1 = 1;
						break;
					}
				}
				if (flag1 == 0)
				{
					for (k = 0;k < hang;k++)
					{
						if (shuzu[i][j] > shuzu[k][j])
						{
							flag2 = 1;
							break;
						}
					}
					if (flag2 == 0)
					{
						System.out.printf("%d+%d",i,j);
						flag3++;
					}
				}

			}
		}
			if (flag3 == 0)
			{
				System.out.print("No");
			}
	}





}

