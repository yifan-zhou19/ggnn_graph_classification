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
		int i;
		int s = 0;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	 if (y1 != y2)
	 {
			for (i = y1 + 1;i < y2;i++)
			{
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				{
					s += 366;
				}
				else
				{
					s += 365;
				}
			}
			for (i = m1 + 1;i <= 12;i++)
			{
					s += a[i];
			}
			for (i = 1;i < m2;i++)
			{
					s += a[i];
			}
			s += a[m1] - d1 + d2;
			if (((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0)) && m1 <= 2)
			{
				s++;
			}
			if (((y2 % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) && m2 > 2)
			{
				s++;
			}

			System.out.print(s);
	 }
	 else
	 {
			  if (m1 != m2)
			  {

				for (i = m1 + 1;i < m2;i++)
				{
					s += a[i];
				}
				 if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0) && m1 <= 2 && m2>2)
				 {
					 s++;
				 }
				System.out.print(s);
			  }
			  else
			  {
				  s = d2 - d1;
				 System.out.print(s);
			  }
	 }
		return 0;
	}





}

