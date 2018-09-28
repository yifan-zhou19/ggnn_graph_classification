package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int year;
		int month1;
		int month2;
		int l;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 0;
			if (month1 > month2)
			{
				l = month2;
				month2 = month1;
				month1 = l;
			}
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			{
				for (int j = month1;j < month2;j++)
				{
					sum += b[j - 1];
				}
			}
			else
			{
				for (int j = month1;j < month2;j++)
				{
					sum += a[j - 1];
				}
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
}

