package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int over;
		int j;
		int i;
		int m;
		int zongshu;
		int jieshu;
		int a;
		int k;
		int[] leiji = new int[60];
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
			if (m == 0)
			{
				zongshu = 60;
			}
			if (m != 0)
			{
				for (j = 0;j < m;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						leiji[j] = Integer.parseInt(tempVar3);
					}
				}
				over = leiji[m - 1] + 3 * (m - 1);
				if (over <= 60)
				{
					if (over <= 57)
					{
						zongshu = 60 - 3 * m;
					}
					else
					{
						zongshu = over - 3 * (m - 1);
					}
				}
				if (over > 60)
				{
					jieshu = leiji[m - 2] + 3 * (m - 2);
					if (jieshu < 60)
					{
					  if (jieshu <= 57)
					  {
						zongshu = 60 - 3 * (m - 1);
					  }
					else
					{
						zongshu = jieshu - 3 * (m - 2);
					}
					}
					else
					{
						zongshu = 60 - 3 * (m - 2);
					}
				}
			}
		   System.out.printf("%d\n",zongshu);
		}
	return 0;
	}
}

