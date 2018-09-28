package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int year;
		int a;
		int b;
		int k;
		int i;
		int t;
		int sum;
		int[] x = {3, 1, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3};
		int[] y = {3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 0;
			if (a > b)
			{
				k = a;
				a = b;
				b = k;
			}
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				for (t = a - 1;t < b - 1;t++) //?????!?a?????x[a-1]!!!
				{
					sum = sum + x[t];
				}
			}
			else
			{
				for (t = a - 1;t < b - 1;t++)
				{

					sum = sum + y[t];
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
		return 0;
	}

}

