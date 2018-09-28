package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k = 0;
		int x = 0;
		int y = 0;
		int temp = 0;
		int sum = 0;
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < x;j++)
			{
				for (m = 0;m < y;m++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						temp = Integer.parseInt(tempVar4);
					}
					if (j == 0 || m == 0 || j == x - 1 || m == y - 1)
					{
						sum = sum + temp;
					}
				}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}

}

