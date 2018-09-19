package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int sum;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		sum = 0;
		for (i = 1;i < m;i++)
		{
			if ((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10))
			{
				sum = sum + 31;
			}
			else if (i == 2)
			{
				if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
				{
					sum = sum + 29;
				}
				else
				{
					sum = sum + 28;
				}
			}
			else
			{
				sum = sum + 30;
			}
		}
		sum = sum + d;
		System.out.printf("%d\n",sum);
		return 0;
	}

}

