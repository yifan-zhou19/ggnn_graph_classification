package <missing>;

public class GlobalMembers
{
	//****************************
	//???????????
	//???2013.12.17
	//****************************
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 0)
		{
			int i = 0;
			int k = 0;
			int year = 0;
			int m1 = 0;
			int m2 = 0;
			int sum = 0;
			int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
			{
				a[1] = 29;
			}
			if (m1 > m2)
			{
				k = m1;
				m1 = m2;
				m2 = k;
			}
			for (i = m1 - 1;i < m2 - 1;i++)
			{
				sum = sum + a[i];
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
		  n--;
		}
		return 0;
	}

}

