package <missing>;

public class GlobalMembers
{
	//???
	public static int Main()
	{
		int n;
		int year;
		int m1;
		int m2;
		int i;
		int j;
		int days;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //????a[12]???12?????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
				year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[1] = 28;
			days = 0;
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			{
				a[1] = 29; //??????????????2????
			}
			if (m1 < m2)
			{
					for (j = m1 - 1;j <= m2 - 2;j++)
					{
						days = days + a[j]; //??????1??????
					}
			}
			else
			{
					for (j = m2 - 1;j <= m1 - 2;j++)
					{
						days = days + a[j];
					}
			}
			if (days % 7 == 0)
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

