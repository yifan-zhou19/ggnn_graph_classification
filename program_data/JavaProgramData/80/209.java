package <missing>;

public class GlobalMembers
{
	public static int sy;
	public static int sm;
	public static int sd;
	public static int ey;
	public static int em;
	public static int ed;
	public static int i;
	public static int[] pmonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0};
	public static int[] rmonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0};
	public static int day = 0;
	public static int[] sum = new int[10];
	public static int r = 0;
	public static void load()
	{
		sy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	public static int isrun(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void cacul()
	{
		if (ey > sy)
		{
		if (isrun(sy) == 1)
		{
			for (i = sm + 1;i < 14;i++)
			{
				sum[1] = sum[1] + rmonth[i];
			}
			sum[2] = rmonth[sm] - sd + 1;
		}
		if (isrun(sy) == 0)
		{
			for (i = sm + 1;i < 14;i++)
			{
				sum[1] = sum[1] + pmonth[i];
			}
			sum[2] = pmonth[sm] - sd + 1;
		}
		if (isrun(ey) == 1)
		{
			for (i = 0;i < em;i++)
			{
				sum[3] = sum[3] + rmonth[i];
			}
			sum[4] = ed;
		}
		if (isrun(ey) == 0)
		{
			for (i = 0;i < em;i++)
			{
				sum[3] = sum[3] + pmonth[i];
			}
			sum[4] = ed;
		}
		if ((ey - sy) > 1)
		{
			for (i = sy + 1;i < ey;i++)
			{
				 if (isrun(i) == 1)
				 {
					sum[5] = sum[5] + 366;
				 }
				 if (isrun(i) == 0)
				 {
				   sum[5] = sum[5] + 365;
				 }
			}
		}
		else
		{
			sum[5] = 0;
		}
		for (i = 1;i <= 5;i++)
		{
			r = r + sum[i];
		}
		System.out.print(r - 1);
		}
		else
		{
			if (sm == em)
			{
				System.out.print(ed - sd);
			}
			else
			{
				if (isrun(sy) == 1)
				{
					for (i = sm;i < em;i++)
					{
						sum[6] = sum[6] + rmonth[i];
					}
					sum[6] = sum[6] - rmonth[sm] + 1 + ed;
				}
				if (isrun(sy) == 0)
				{
					for (i = sm;i < em;i++)
					{
						sum[6] = sum[6] + pmonth[i];
					}
					sum[6] = sum[6] - rmonth[sm] + 1 + ed;
				}
				System.out.print(sum[6]);
			}
		}
	}

	public static int Main()
	{
		load();
		cacul();
	}

}

