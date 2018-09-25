package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int year;
		int month1;
		int month2;
		int i;
		int j;
		int k;
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (year % 400 == 0) //????
			{
				k = 1;
			}
			else if (year % 100 == 0)
			{
				k = 0;
			}
			else if (year % 4 == 0)
			{
				k = 1;
			}
			else
			{
				k = 0;
			}
			if (k == 1)
			{
				a[2] = 29;
			}
			else
			{
				a[2] = 28;
			}
			if (month1 > month2)
			{
				k = month2;
				month2 = month1;
				month1 = k;
			}
			s = 0;
			for (j = month1;j < month2;j++) //??????
			{
				s += a[j];
			}
			if (s % 7 == 0) //?????
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

