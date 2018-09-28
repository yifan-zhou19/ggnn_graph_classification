package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int y;
		int s = 0;
		int i;
		int j;
		sy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (ey > sy)
		{
			for (i = sm - 1; i < 12; i++)
			{
				if ((sy % 4 == 0 && sy % 100 != 0) || (sy % 400 == 0))
				{
				 s = s + b[i];
				}
				else
				{
					s = s + a[i];
				}
			}
			for (i = sy + 1; i < ey; i++)
			{
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				{
					for (int j = 0; j < 12; j++)
					{
						s = s + b[j];
					}
				}
				else
				{
					for (int j = 0; j < 12; j++)
					{
						s = s + a[j];
					}
				}
			}
				if ((ey % 4 == 0 && ey % 100 != 0) || (ey % 400 == 0))
				{
				for (int j = 0; j < em - 1; j++)
				{
					s = s + b[j];
				}
				}
				else
				{
					for (int j = 0; j < em - 1; j++)
					{
					s = s + a[j];
					}
				}
		}
		else
		{
			for (i = sm - 1; i < em - 1; i++)
			{
				if ((sy % 4 == 0 && sy % 100 != 0) || (sy % 400 == 0))
				{
				 s = s + b[i];
				}
				else
				{
					s = s + a[i];
				}
			}
		}
		s = s + ed - sd;
		System.out.print(s);
		return 0;
	}
}

