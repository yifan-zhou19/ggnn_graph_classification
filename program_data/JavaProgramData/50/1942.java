package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int m;
		int i;
		int j;
		int day = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= 12;i++)
		{
			day = 0;
					j = 1;
			while (j <= i - 1)
			{
				day += month[j];
				j++;
			}
			day += 13;
			if ((day + m - 6) % 7 == 0)
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}
	 return 0;
	}

}

