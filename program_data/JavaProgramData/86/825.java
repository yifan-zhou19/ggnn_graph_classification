package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[100];
		int[] count = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < m;j++)
			{
				a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if ((a[j] + j * 3 >= 57) && (a[j] + j * 3 <= 60))
				{
					count[i] = a[j];
				}
				else if ((a[j] + j * 3 > 60) && (a[j - 1] + (j - 1) * 3 < 57))
				{
					count[i] = 60 - j * 3;
				}
				else
				{
					continue;
				}
			}
			if (m == 0)
			{
				count[i] = 60;
			}
			else if (a[m - 1] + m * 3 <= 60)
			{
				count[i] = 60 - m * 3;
			}


			System.out.print(count[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

