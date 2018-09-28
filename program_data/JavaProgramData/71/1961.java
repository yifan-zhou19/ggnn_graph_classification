package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int n;
		int m1;
		int m2;
		int d;
		int i;
		int j;
		int counter;
		int counter1 = 0;
		int counter2 = 0;
		int[] month1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] month2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j < x;j++)
		{
		counter = 0;
		counter1 = 0;
		counter2 = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0))
		{
			for (i = 0;i < m1 - 1;i++)
			{
				counter1 += month2[i];
			}
			counter1 += 1;
		}
		else
		{
			for (i = 0;i < m1 - 1;i++)
			{
				counter1 += month1[i];
			}
			counter1 += 1;
		}
		if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0))
		{
			for (i = 0;i < m2 - 1;i++)
			{
				counter2 += month2[i];
			}
			counter2 += 1;
		}
		else
		{
			for (i = 0;i < m2 - 1;i++)
			{
				counter2 += month1[i];
			}
			counter2 += 1;
		}
		if (counter1 > counter2)
		{
			counter = counter1 - counter2;
		}
		else
		{
			counter = counter2 - counter1;
		}
		if (counter % 7 == 0)
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

