package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int YY;
		int M1;
		int M2;
		int i;
		int j;
		int d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			d = 0;
			YY = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			M1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			M2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((YY % 4 == 0 && YY % 100 != 0) || YY % 400 == 0)
			{
				if (M1 > M2)
				{
					for (j = M2; j <= M1 - 1; j++)
					{
						d = d + b[j - 1];
					}
				}
				else
				{
					for (j = M1; j <= M2 - 1; j++)
					{
						d = d + b[j - 1];
					}
				}
			}
			else
			{
				if (M1 > M2)
				{
					for (j = M2; j <= M1 - 1; j++)
					{
						d = d + a[j - 1];
					}
				}
				else
				{
					for (j = M1; j <= M2 - 1; j++)
					{
						d = d + a[j - 1];
					}
				}
			}
			if (d % 7 == 0)
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

