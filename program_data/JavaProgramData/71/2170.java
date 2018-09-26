package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] month = new int[201][3];
		int[] day1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] day2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
				month[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int sum1;
		int sum2;
		for (i = 0;i < n;i++)
		{
			if ((month[i][0] % 400 == 0) || ((month[i][0] % 4 == 0) && (month[i][0] % 100 != 0)))
			{
				sum1 = 0;
				sum2 = 0;
				for (j = 0;j < month[i][1] - 1;j++)
				{
					sum1 = sum1 + day2[j];
				}
				for (j = 0;j < month[i][2] - 1;j++)
				{
					sum2 = sum2 + day2[j];
				}
				if ((Math.abs(sum2 - sum1)) % 7 == 0)
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
			else
			{
				sum1 = 0;
				sum2 = 0;
				for (j = 0;j < month[i][1] - 1;j++)
				{
					sum1 = sum1 + day1[j];
				}
				for (j = 0;j < month[i][2] - 1;j++)
				{
					sum2 = sum2 + day1[j];
				}
				if ((Math.abs(sum2 - sum1)) % 7 == 0)
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
		}
		return 0;
	}
}

