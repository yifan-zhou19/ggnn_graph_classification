package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int k;
		int i;
		int j;
		int time;
		int sum;
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
				m = Integer.parseInt(tempVar2);
			}
			time = 0;
			sum = 0;
			if (m == 0)
			{
					System.out.print("60\n");
			}
			else
			{
			   for (j = 1;j <= m;j++)
			   {
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						k = Integer.parseInt(tempVar3);
					}
					if ((k + 3 * j) > 60 && (k - sum >= 60 - time))
					{
						continue;
					}
					else if (time > 60)
					{
						continue;
					}
					else
					{
						sum = k;
					}
					time = k + 3 * j;
			   }
			if (time < 60)
			{
				sum += 60 - time;
			}
			System.out.printf("%d\n",sum);
			}
		}
		return 0;
	}
}

