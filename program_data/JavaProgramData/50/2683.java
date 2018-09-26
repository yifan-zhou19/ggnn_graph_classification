package <missing>;

public class GlobalMembers
{
	// ?????.cpp : ??????????????
	//


	public static int weekdays(int n)
	{
		if (n <= 7)
		{
			return n;
		}
		else
		{
			return weekdays(n - 7);
		}
	}

	public static int Main() //(int argc, _TCHAR* argv[])
	{
		int[][] days = new int[13][32];
		int i;
		int j;
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
			for (j = 1;;j++)
			{
				days[i][j] = j;
				if (j == 28 && i == 2)
				{
					break;
				}
				if (j == 30 && (i == 4 || i == 6 || i == 9 || i == 11))
				{
					break;
				}
				if (j == 31 && (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12))
				{
					break;
				}
			}
		}
		int[][] weekday = new int[13][32];
		weekday[1][1] = w;
		for (i = 1;i <= 12;i++)
		{
			for (j = 1;;j++)
			{
				weekday[i][j] = weekdays(w + j - 1);
				if (j == 28 && i == 2)
				{
					w = weekdays(weekday[i][j] + 1);
					break;
				}
				if (j == 30 && (i == 4 || i == 6 || i == 9 || i == 11))
				{
					w = weekdays(weekday[i][j] + 1);
					break;
				}
				if (j == 31 && (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12))
				{
					w = weekdays(weekday[i][j] + 1);
					break;
				}
			}
		}
		j = 13;
		for (i = 1;i <= 12;i++)
		{
			if (weekday[i][j] == 5)
			{
				System.out.printf("%d\n",i);
			}
		}



		return 0;
	}


}

