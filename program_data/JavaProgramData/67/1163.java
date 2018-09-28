package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		float a;
		float b;
		int[][] num = new int[100][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					num[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		a = (float)num[0][1] * 100 / num[0][0];

		for (i = 1;i < n;i++)
		{
			b = (float)num[i][1] * 100 / num[i][0];
			if (b - a > 5F)
			{
				System.out.print("better\n");
			}
			else if (a - b > 5F)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
	}



}

