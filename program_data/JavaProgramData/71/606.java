package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m1;
		int m2;
		int d;
		int y;
		int m;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			sum = 0;
			d = 0;
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m1 > m2)
			{
				m = m1;
				m1 = m2;
				m2 = m;
			}
			m = m1;
			while (m < m2)
			{
				switch (m) //????????
				{
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						d = 31;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						d = 30;
						break;
					case 2:
					{
						if ((y % 400 == 0) || ((y % 100 != 0) && (y % 4 == 0)))
						{
							d = 29; //?????2??29?
						}
						else
						{
							d = 28;
						}
					}
					break;
				}
				sum += d; //?????
				m++;
			}
			if (sum % 7 == 0) //????????
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

