package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] year = new int[200];
		int[] month0 = new int[200];
		int[] month1 = new int[200];
		int day;
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int num;
		int i;
		int j;
		int t;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < num; i++)
		{
			day = 0;
			year[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month0[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (month0[i] > month1[i])
			{
				t = month0[i];
				month0[i] = month1[i];
				month1[i] = t;
			}
			if ((year[i] % 4 == 0 && year[i] % 100 != 0) || year[i] % 400 == 0)
			{
				month[1] = 29;
			}
			else
			{
				month[1] = 28;
			}
			for (j = month0[i]; j <= month1[i] - 1; j++)
			{
				day += month[j - 1];
			}
			if (day % 7 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
		return 0;
	}



}

