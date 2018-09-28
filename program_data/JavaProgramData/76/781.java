package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int pd = 1;
		int[][] num = new int[50000][2];
		int max = 0;
		int min;
		int[] qj = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				num[i][1] = Integer.parseInt(tempVar3);
			}
			if (num[i][1] >= max)
			{
				max = num[i][1];
			}
			for (j = num[i][0];j < num[i][1];j++)
			{
				qj[j * 2] = 1;
				qj[j * 2 + 1] = 1;
			}
			qj[j * 2] = 1;
		}
		for (j = 0;j <= max * 2;j++)
		{
			if (qj[j] == 1)
			{
				min = j * 0.5;
				for (;j <= max * 2;j++)
				{
					if (qj[j] == 0)
					{
						System.out.print("no");
						pd = 0;
					}
				}
				if (pd == 1)
				{
					System.out.printf("%d %d",min,max);
				}
				else
				{
					break;
				}
			}
		}
	}
}

