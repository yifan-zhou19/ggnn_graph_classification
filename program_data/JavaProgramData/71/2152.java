package <missing>;

public class GlobalMembers
{
	//??(10.5) ???
	public static int Main()
	{
		int n;
		int y;
		int m1;
		int m2;
		int i;
		int j;
		int sum;
		int t;
		int[] x = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++) //????????????
		{
			sum = 0;
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m1 > m2) //?m1>m2???
			{
				t = m1;
				m1 = m2;
				m2 = t;
			}
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) //???????x??12???
			{
				for (j = 11 + m1;j <= 10 + m2;j++)
				{
					sum += x[j];
				}
			}
			else //????x??12?????
			{
				for (j = m1 - 1;j <= m2 - 2;j++)
				{
					sum += x[j];
				}
			}
			if (sum % 7 == 0) //????
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

