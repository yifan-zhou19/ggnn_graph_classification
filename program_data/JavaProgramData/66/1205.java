package <missing>;

public class GlobalMembers
{
	public static int isrunnian(int y)
	{
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
		{
			return 1;
		}
		return 0;
	}
	public static int Main()
	{
		int y;
		int m;
		int d;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		sum = (y % 7 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400) % 7;


		int[][] month =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		int i;
		for (i = 0;i < m - 1;i++)
		{
			sum = sum + month[isrunnian(y)][i];
			sum = sum % 7;

		}


		sum = sum + d - 1;
		sum = sum % 7;

		String[] weekdays = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
		System.out.printf("%s",weekdays[sum]);



	return 0;
	}

}

