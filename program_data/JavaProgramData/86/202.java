package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int time = 0;
		int i;
		int x;
		int j;
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
			if (m != 0)
			{
			for (j = 1;j < m + 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x = Integer.parseInt(tempVar3);
				}
				if (time < 60 && x + 3 * (j - 1) >= 60)
				{
					mark = 60 - 3 * (j - 1);
				}
				if (time < 60 && x + 3 * (j - 1) < 60 && x + 3 * (j - 1)>57)
				{
					mark = x;
				}
				if (time < 60 && x + 3 * j < 60)
				{
					mark = 60 - j * 3;
				}
				time = x + j * 3;
			}
			}
			if (m == 0)
			{
				mark = 60;
			}
			System.out.printf("%d\n", mark);
		}
			return 0;
	}
}

