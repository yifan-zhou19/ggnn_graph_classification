package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int result = 0;
	int y1;
	int m1;
	int d1;
	int y2;
	int m2;
	int d2;
	int i;
	int ylp;
	int[][] day =
	{
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	int[] year = {365, 366};
	y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));


	ylp = y2 - y1 - 1;

	if (ylp > 0)
	{
		for (i = y1 + 1;i < y2;i++)
		{
			 result += year[(i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)];
		}

	}

	if (y1 != y2)
	{
	if (m1 < 12)
	{
		for (i = m1;i < 12;i++)
		{
			 result += day[(y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0)][i];
		}
	}




	if (m2 > 1)
	{
		for (i = 0;i < m2 - 1;i++)
		{
			 result += day[(y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0)][i];
		}

	}
	result += day[(i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)][m1 - 1] - d1;
	result += d2;
	}
	else
	{

		if (m1 != m2)
		{
		   for (i = m1;i < m2 - 1;i++)
		   {
			  result += day[(y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0)][i];
		   }
		   result += day[(i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)][m1 - 1] - d1;
			result += d2;

		}
		else
		{
			result += d2 - d1;
		}
	}


	System.out.print(result);
	System.out.print("\n");
	return 0;
	}
}

