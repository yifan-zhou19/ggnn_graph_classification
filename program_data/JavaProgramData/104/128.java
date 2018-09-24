package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] x = new int[11];
		int[] y = new int[11];
		int i;
		int j;
		int flag = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y[0] = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < 10;i++)
		{
			x[i + 1] = x[i] / 2;
			if (x[i] == 1)
			{
				break;
			}
		}
		for (j = 0;j < 10;j++)
		{
			y[j + 1] = y[j] / 2;
			if (y[j] == 1)
			{
				break;
			}
		}
		for (i = 0;i < 11;i++)
		{
			if (x[i] == 1)
			{
				System.out.print("1\n");
				break;
			}
			for (j = 0;j < 11;j++)
			{
				if (x[i] == y[j])
				{
					System.out.printf("%d\n",x[i]);

					if (x[i + 1] == y[j + 1])
					{
						flag = 0;
					}
					break;
				}
			}
			if (flag == 0)
			{
				break;
			}
		}
	}


}

