package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int i;
		int j;
		int[] mouth1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] mouth2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = y1;i < y2;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				n1 += 366;
			}
			else
			{
				n1 += 365;
			}
		}
		if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
		{
			for (j = 0;j < m2;j++)
			{
				n2 += mouth2[j];
			}
		}
		else
		{
			for (j = 0;j < m2;j++)
			{
				n2 += mouth1[j];
			}
		}
		if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
		{
				for (j = 0;j < m1;j++)
				{
					n2 -= mouth2[j];
				}
		}
			else
			{
				for (j = 0;j < m1;j++)
				{
					n2 -= mouth1[j];
				}
			}
		n3 = d2 - d1;
		int sum = n1 + n2 + n3;
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

