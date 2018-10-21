package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] year = new int[2];
		int[] month = new int[2];
		int[] day = new int[2];
		int[][] a =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		int i;
		int j;
		int[] flag = new int[2];
		int[] count = {0, 0};
		int[] b = {365, 366};
		int[] c = {0, 0};
		for (i = 0;i < 2;i++)
		{
			year[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			day[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		if (year[0] > year[1])
		{
			j = year[1];
			year[1] = year[0];
			year[0] = j;
			j = month[1];
			month[1] = month[0];
			month[0] = j;
			j = day[1];
			day[1] = day[0];
			day[0] = j;
		}
		flag[0] = year[0] % 4 == 0 && year[0] % 100 != 0 || year[0] % 400 == 0;
		flag[1] = year[1] % 4 == 0 && year[1] % 100 != 0 || year[1] % 400 == 0;
		count[0] += day[0] - 1;
		count[1] += day[1] - 1;
		for (i = 0;i < 2;i++)
		{
			while (c[i] + 1 < month[i])
			{
					count[i] += a[flag[i]][c[i]];
					c[i]++;
			}
		}
		while (year[0] < year[1])
		{
			count[1] += b[year[0] % 4 == 0 && year[0] % 100 != 0 || year[0] % 400 == 0];
			year[0]++;
		}
		System.out.print(count[1] - count[0]);
		System.out.print("\n");
		char mm;
		mm = ConsoleInput.readToWhiteSpace(true).charAt(0);
		return 0;
	}

}

