package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int y1;
	int m1;
	int d1;
	int y2;
	int m2;
	int d2;
	y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.out.print("\n");
	y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int count = 0;
	while (!((y1 == y2) && (m1 == m2) && (d1 == d2)))
	{
	count++;
	d1++;
	if ((m1 == 12) && (d1 == 32))
	{
	y1++;
	m1 = 1;
	d1 = 1;
	}
	else if (((m1 == 1) || (m1 == 3) || (m1 == 5) || (m1 == 7) || (m1 == 8) || (m1 == 10)) && (d1 == 32))
	{
	m1++;
	d1 = 1;
	}
	else if (((m1 == 4) || (m1 == 6) || (m1 == 9) || (m1 == 11)) && (d1 == 31))
	{
	m1++;
	d1 = 1;
	}
	else if (m1 == 2)
	{
	if (((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0)) && (d1 == 30))
	{
	m1++;
	d1 = 1;
	}
	else if ((!((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))) && (d1 == 29))
	{
	m1++;
	d1 = 1;
	}
	}
	}
	System.out.print(count);
	System.out.print("\n");
	}

}

