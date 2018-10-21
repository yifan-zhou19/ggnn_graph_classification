package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int l;
		int c;
		int[][] num = new int[8][8];
		int i;
		int j;
		int[] max = new int[8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < l;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < l;i++)
		{
			max[i] = 0;
			for (j = 1;j < c;j++)
			{
				if (num[i][max[i]] < num[i][j])
				{
					max[i] = j;
				}
			}
		}
		for (i = 0;i < l;i++)
		{
			for (j = 0;j < l;j++)
			{
				if (num[i][max[i]] > num[j][max[i]])
				{
					break;
				}
			}
			if (j >= l)
			{
				System.out.printf("%d+%d",i,max[i]);
				return;
			}
		}
		System.out.print("No");
	}

}

