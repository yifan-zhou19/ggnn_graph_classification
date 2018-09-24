package <missing>;

public class GlobalMembers
{
	public static int findmax(int[] a)
	{
		int max = 0;
		int i;
		for (i = 0;i < 100;i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
		}
		return max;
	}
	public static void Main()
	{
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
		int[][] a = new int[100][100];
		int i;
		int j;
		for (i = 0;i < hang;i++)
		{
			for (j = 0;j < lie;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int max;
		int k;
		int flag;
		for (i = 0;i < hang;i++)
		{

			max = findmax(a[i]);
			for (j = 0;j < lie;j++)
			{

				if (a[i][j] == max)
				{
					flag = 1;
					for (k = 0;k < hang;k++)
					{
						if (a[k][j] < a[i][j])
						{
							flag = 0;
						}
					}
					if (flag != 0)
					{
						System.out.printf("%d+%d",i,j);
						break;
					}
				}
			}
			if (flag != 0)
			{
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
	}
}

