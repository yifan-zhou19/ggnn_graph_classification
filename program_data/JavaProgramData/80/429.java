int tian = new int(int, int, int);
int[] g_a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
int[] g_b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
int main()
{
	int y1;
	int y2;
	int m1;
	int m2;
	int d1;
	int d2;
	y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	int sum1 = 0;
	int sum2 = 0;
	sum1 = tian(y1, m1, d1);
	sum2 = tian(y2, m2, d2);
	System.out.print(sum2 - sum1);
	System.out.print("\n");
	return 0;
}
int tian(int y, int m, int d)
{
	int i;
	int sum = 0;
	for (i = 1; i < y; i++)
	{
		if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
		{
			sum += 366;
		}
		else
		{
			sum += 365;
		}
	}
	for (i = 1; i < m; i++)
	{
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
			sum += g_b[i];
		}
		else
		{
			sum += g_a[i];
		}
	}
	sum += d;
	return sum;
}





