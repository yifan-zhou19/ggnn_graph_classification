package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] y = new int[2];
		int[] m = new int[2];
		int[] d = new int[2];
		int td = 0;
		int tm = 0;
		int ty = 0;
		int t;
		int s;
		int i;
		int[] mon_1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] mon_2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		y[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		td = d[1] - d[0];
		if ((y[1] % 4 == 0 && y[1] % 100 != 0) || (y[1] % 400 == 0))
		{
			if (m[1] < m[0])
			{
				for (i = m[1];i < m[0];i++)
				{
					tm = tm - mon_2[i - 1];
				}
			}
			else if (m[1] > m[0])
			{
				for (i = m[0];i < m[1];i++)
				{
					tm = tm + mon_2[i - 1];
				}
			}
		}
		else
		{
			if (m[1] < m[0])
			{
				for (i = m[1];i < m[0];i++)
				{
					tm = tm - mon_1[i - 1];
				}
			}
			else if (m[1] > m[0])
			{
				for (i = m[0];i < m[1];i++)
				{
					tm = tm + mon_1[i - 1];
				}
			}
		}
		if (y[1] > y[0])
		{
		if (m[0] <= 2)
		{
			if ((y[0] % 4 == 0 && y[0] % 100 != 0) || (y[0] % 400 == 0))
			{
				ty = ty + 366;
			}
			else
			{
				ty = ty + 365;
			}
		}
		else
		{
			ty = ty + 365;
		}
		}
		for (i = y[0] + 1;i < y[1];i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				ty = ty + 366;
			}
			else
			{
				ty = ty + 365;
			}
		}
		//cout<<td<<" "<<tm<<" "<<ty<<endl;
		s = td + tm + ty;
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}
}

