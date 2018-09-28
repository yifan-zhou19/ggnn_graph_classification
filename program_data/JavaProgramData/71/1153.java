package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int max;
		int min;
		int j;
		int k;
		int n;
		int y;
		int a;
		int b;
		int s;
		int[] day1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] day2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b = Integer.parseInt(tempVar4);
			}
			if (a > b)
			{
				max = a;
				min = b;
			}
			else if (a < b)
			{
				max = b;
				min = a;
			}
			if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))
			{
				for (j = min;j < max;j++)
				{
					s += day2[j];
				}
			}
			else
			{
				for (k = min;k < max;k++)
				{
					s += day1[k];
				}
			}
			if (s % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else if (s % 7 != 0)
			{
				System.out.print("NO\n");
			}
		}
			return 0;
	}
}

