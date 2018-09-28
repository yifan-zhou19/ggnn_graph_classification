package <missing>;

public class GlobalMembers
{
	//????
	//2010?11?19?
	//1000012753 ???
	public static int Main()
	{
		int n;
		int m;
		int i;
		int sum;
		int stop;
		int[] a = new int[200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0; i < m; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			while (true)
			{
				if (m == 0)
				{
					sum = 60;
					break;
				}
				if (a[m - 1] + (m - 1) * 3 > 60)
				{
					m--;
				}
				else if (a[m - 1] + (m - 1) * 3 >= 57 && a[m - 1] + (m - 1) * 3 <= 60)
				{
					sum = a[m - 1];
					break;
				}
				else
				{
					sum = 60 - m * 3;
					break;
				}
			}

			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

