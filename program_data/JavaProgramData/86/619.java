package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int wrong_mark;
		int i;
		int j;
		int time;
		int mark;
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
				mark = 60;
			}
			if (m != 0)
			{
				for (j = 1;j < m + 1;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						wrong_mark = Integer.parseInt(tempVar3);
					}
					time = wrong_mark + 3 * j;
					if (time < 57 && wrong_mark < 60 - 3 * m)
					{
						mark = wrong_mark + 60 - time;
					}
					if (time >= 57 && wrong_mark < 66 - 3 * m)
					{
						mark = wrong_mark;
					}
				}
			}
			System.out.printf("%d\n",mark);
		}
		return 0;
	}


}

