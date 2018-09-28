package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int year;
		int moon1;
		int moon2;
		int p;
		int q;
		int i;
		int sum;
		int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (n;n > 0;n--)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			moon1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			moon2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p = (moon1 > moon2)?moon1:moon2;
			q = (moon1 < moon2)?moon1:moon2;
			sum = 0;
			day[1] = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)?29:28;
			for (i = q;i <= p - 1;i++)
			{
				sum += day[i - 1];
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

