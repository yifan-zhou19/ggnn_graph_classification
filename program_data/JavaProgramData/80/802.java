package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		sy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] py = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] ry = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int count = 0;
		int year = sy;
		if (sy != ey)
		{

				  if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				  {
						 for (int m = sm;m < 12;m++)
						 {
								{
											   count += ry[m];
							}
						 }
				  }
				else
				{
						 for (int m = sm;m < 12;m++)
						 {
								{
											   count += py[m];
							}
						 }
				}
				count += 32 - sd;
				sy += 1;
				sd = 1;
				sm = 1;
		}
		for (;sy < ey;sy++)
		{
				if ((sy % 4 == 0 && sy % 100 != 0) || (sy % 400 == 0))
				{
				count += 366;
				}
				else
				{
				count += 365;
				}
		}
		year = ey;
		 if (sm != em)
		 {
				  if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				  {
						   for (int m = sm;m < em;m++)
						   {
									{
												   count += ry[m];
								}
						   }
				  }
				  else
				  {
						   for (int m = sm;m < em;m++)
						   {
									{
												   count += py[m];
								}
						   }
				  }

		 }
		 count += ed - sd;
		 System.out.print(count);
		 System.out.print("\n");
		 return 0;
	}

}

