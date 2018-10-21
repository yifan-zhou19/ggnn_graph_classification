package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int i;
		int j;
		int k;
		int year;
		int x;
		int y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= n;k++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = 0;
			if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			{
				if (x > y)
				{
					for (i = y;i <= (x - 1);i++)
					{
					j = j + a[i];
					}
				}
				else
				{
					for (i = x;i <= (y - 1);i++)
					{
					j = j + a[i];
					}
				}
				if ((j % 7) == 0)
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
			else
			{
				  if (x > y)
				  {
					for (i = y;i <= (x - 1);i++)
					{
					j = j + b[i];
					}
				  }
				else
				{
					for (i = x;i <= (y - 1);i++)
					{
					j = j + b[i];
					}
				}
				if ((j % 7) == 0)
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
		return 0;
	}
}

