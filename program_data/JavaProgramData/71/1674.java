package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int y;
		int m1;
		int m2;
		int a;
		int b;
		int i;
		int sum;
		int j;
		int[] d = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 1;i <= n;i++)
		{
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 0;
			if (m1 - m2 >= 0)
			{
			   a = m1;
			   b = m2;
			}
			else
			{
			   a = m2;
			   b = m1;
			}
			for (j = b;j < a;j++)
			{
				sum += d[j];
				if ((j == 2) && ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)))
				{
				   sum++;
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
		return (0);
	}
}

