package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[200][3];
		int i;
		int[] b = new int[11];
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[0] = 31;
		b[2] = 31;
		b[3] = 30;
		b[4] = 31;
		b[5] = 30;
		b[6] = 31;
		b[7] = 31;
		b[8] = 30;
		b[9] = 31;
		b[10] = 30;
		int year;
		int mon_1;
		int mon_2;
		for (i = 0;i < n;i++)
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			int sum = 0;
			year = a[i][0];
			mon_1 = a[i][1];
			mon_2 = a[i][2];
			if (a[i][1] >= a[i][2])
			{
				int temp;
			temp = mon_1;
			mon_1 = mon_2;
			mon_2 = temp;
			}
			if ((year % 4 == 0 && year % 100 != 0) || ((year % 400) == 0))
			{
				b[1] = 29;
				for (t = (mon_1 - 1);t < (mon_2 - 1);t++)
				{
						sum = sum + b[t];
				}
				if (sum % 7 == 0)
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
				b[1] = 28;
				for (t = (mon_1 - 1);t < (mon_2 - 1);t++)
				{
						sum = sum + b[t];
				}
				if (sum % 7 == 0)
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

