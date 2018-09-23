package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int y;
	int m;
	int d;
	int i;
	int s = 0;
	int[] m1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int[] m2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
	{
	for (i = 0;i < m - 1;i++)
	{
	s += m2[i];
	}
	}
	else
	{
	for (i = 0;i < m - 1;i++)
	{
	s += m1[i];
	}
	}
	System.out.print(s + d);
	System.out.print("\n");
	return 0;
	}
}

