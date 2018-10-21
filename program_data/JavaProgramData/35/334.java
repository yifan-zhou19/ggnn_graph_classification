package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] a = new int[8][8];
		int i;
		int j;
		int[] max = new int[8];
		int k;
		int h;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
				if (a[i][j] > max[i])
				{
					max[i] = a[i][j];
				}
			}
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				if (a[i][j] == max[i])
				{
					for (k = 0;k < h;k++)
					{
						if (max[i] > a[k][j])
						{
							break;
						}
						else
						{
							continue;
						}
					}
					if (k == h)
					{
						System.out.printf("%d+%d",i,j);
					}
					else
					{
						max[i] = 0;
						break;
					}
				}
			}
		}
		if (max[0] + max[1] + max[2] + max[3] + max[4] + max[5] + max[6] + max[7] == 0)
		{
		System.out.print("No");
		}
	}

}

