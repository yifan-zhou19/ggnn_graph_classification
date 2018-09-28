package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		int population;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			population = Integer.parseInt(tempVar);
		}
		for (i = 0;i < population;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
			System.out.print("60\n");
			}
			else
			{
				for (j = 0;j < m;j++)
				{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					k = Integer.parseInt(tempVar3);
				}
				if (3 * j + 3 + k < 60)
				{
					sum = 57 - 3 * j;
				}
				else if (3 * j + k < 60)
				{
					sum = k;
				}
				}
			System.out.printf("%d\n",sum);
			}
		}
	}


}

