int leap = int;
int main()
{
	int sy;
	int sm;
	int sd;
	int ey;
	int em;
	int ed;
	int sum = 0;
	int[] a = new int[13];
	int[] b = new int[13];
	int i;
	for (i = 1;i < 13;i++)
	{
		if (i == 2)
		{
			a[i] = 28;
		}
		else if (i == 4 || i == 6 || i == 9 || i == 11)
		{
			a[i] = 30;
		}
		else
		{
			a[i] = 31;
		}
	}
	for (i = 1;i < 13;i++)
	{
		if (i == 2)
		{
			b[i] = 29;
		}
		else if (i == 4 || i == 6 || i == 9 || i == 11)
		{
			b[i] = 30;
		}
		else
		{
			b[i] = 31;
		}
	}
	sy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	sm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	sd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (sy == ey)
	{
		if (sm == em)
		{
			sum += ed - sd;
		}
		else
		{
			for (i = sm + 1;i <= em - 1;i++)
			{
			if (i == 2)
			{
				if (leap(sy))
				{
					sum += b[i];
				}
				else
				{
					sum += a[i];
				}
			}
			else
			{
				sum += a[i];
			}
			}
		sum = sum + ed - 1;
		if (sm == 2)
		{
			if (leap(sy))
			{
				sum += b[2] - sd + 1;
			}
			else
			{
				sum += a[2] - sd + 1;
			}
		}
		else
		{
			sum = sum + a[sm] - sd + 1;
		}
		}
		System.out.print(sum);
		System.out.print("\n");
	}
	else
	{
		for (i = sy + 1;i <= ey - 1;i++)
		{
			if (leap(i))
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}
		for (i = 1;i <= em - 1;i++)
		{
			if (i == 2)
			{
				if (leap(ey))
				{
					sum += b[i];
				}
				else
				{
					sum += a[i];
				}
			}
			else
			{
				sum += a[i];
			}
		}
		sum += ed - 1;
		for (i = sm + 1;i <= 12;i++)
		{
			if (i == 2)
			{
				if (leap(sy))
				{
					sum += b[i];
				}
				else
				{
					sum += a[i];
				}
			}
			else
			{
				sum += a[i];
			}
		}
		if (sm == 2)
		{
			if (leap(sy))
			{
				sum += b[2] - sd + 1;
			}
			else
			{
				sum += a[2] - sd + 1;
			}
		}
		else
		{
			sum += a[sm] - sd + 1;
		}
		System.out.print(sum);
		System.out.print("\n");
	}
	return 0;
}
int leap(int n)
{
	if (n % 100 == 0)
	{
		if (n % 400 == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	else
	{
		if (n % 4 == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	return 0;
}


