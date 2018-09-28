package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n = 0;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year = 0;
		int month1 = 0;
		int month2 = 0;
		int max = 0;
		int min = 0;
		int k = 0;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			sum = 0,year = 0,month1 = 0,month2 = 0;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (month1 > month2) //??month1?month2??
			{
					max = month1;
					min = month2;
			}
			else
			{
					max = month2;
				min = month1;
			}
			k = 0;
	if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) //???????
	{
				while (min + k < max) //??month1?month2?????
				{
					sum = sum + b[min + k];
					k++;
				}
				if (sum % 7 == 0) //???????
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

	else //??
	{
				while (min + k < max)
				{
					sum = sum + a[min + k];
					k++;
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
}

