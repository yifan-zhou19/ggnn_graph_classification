package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			int m;
			int time = 60;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				int a;
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a = Integer.parseInt(tempVar3);
				}
				if (a < (time-3))
				{
					time -= 3;
				}
				else if (a == (time-3))
				{
					time = a + 1;
				}
				else if (a > (time-3) && a <= time)
				{
					time = a;
				}
			}
				System.out.printf("%d\n",time);
		}
	}


}

