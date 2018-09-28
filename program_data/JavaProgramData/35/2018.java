package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int flag;
		flag = 0;
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

		int i;
		int j;
		int[][] shuzu = new int[100][100];
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

		int[][] tiaoxini = new int[100][2];
		int const1;
		int const2;
		int max;
		int min;
		const1 = 0;
		const2 = 0;
		for (i = 0;i < hang;i++)
		{
			max = 0;
			for (j = 0;j < lie;j++)
			{
				if (shuzu[i][j] > max)
				{
					max = shuzu[i][j];
					tiaoxini[const1][const2] = i;
					const2++;
					tiaoxini[const1][const2] = j;
					const2--;
				}
			}
			const1++;
		}
		const2 = 0;
		for (i = 0;i < lie;i++)
		{
			min = 10000;
			for (j = 0;j < hang;j++)
			{
				if (shuzu[j][i] < min)
				{
					min = shuzu[i][j];
					tiaoxini[const1][const2] = j;
					const2++;
					tiaoxini[const1][const2] = i;
					const2--;
				}
			}
			const1++;
		}

		const2 = 0;
		for (i = 0;i < const1;i++)
		{
			for (j = 1;j <= const1;j++)
			{
				if (tiaoxini[i][0] == tiaoxini[j][0] && tiaoxini[i][1] == tiaoxini[j][1])
				{
					System.out.printf("%d+%d",tiaoxini[i][0],tiaoxini[i][1]);
					flag++;
					break;
				}
			}
			break;
		}


		if (flag == 0)
		{
			System.out.print("No");
		}

		return 0;
	}
}

