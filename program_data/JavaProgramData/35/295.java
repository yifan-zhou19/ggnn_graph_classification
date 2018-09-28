package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] num = new int[8][8];
		int i;
		int j;
		int hang;
		int lie;
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
					num[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int max = num[0][0];
		int maxi;
		int maxj;
		maxi = 0;
		maxj = 0;
		int beforei;
		int judge = 0;
		for (i = 0;i < hang;i++)
		{
			beforei = i;
			for (j = 0;j < lie;j++)
			{
				if (max < num[i][j])
				{
					max = num[i][j];
					maxi = i;
					maxj = j;
				}
			}
			for (i = 0;i < hang;i++)
			{
					if (num[maxi][maxj] > num[i][maxj])
					{
						break;
					}
					if (i == hang - 1)
					{
						System.out.printf("%d+%d",maxi,maxj);
						judge = 1;

					}
			}
		i = beforei;
				if ((i = hang - 1) != 0 && (judge == 0))
				{
					System.out.print("No");
				}



		}


	}

}

