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
		int i;
		int sum = 0;
		sy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //???????????
		int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //???????????
		for (i = sy;i < ey;i++) //???
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
		if ((sy % 4 == 0 && sy % 100 != 0) || (sy % 400 == 0)) //???
		{
		for (i = 0;i < sm;i++)
		{
			sum -= b[i];
		}
		}
		else
		{
			for (i = 0;i < sm;i++)
			{
					sum -= a[i];
			}
		}
		if ((ey % 4 == 0 && ey % 100 != 0) || (ey % 400 == 0))
		{
		for (i = 0;i < em;i++)
		{
			sum += b[i];
		}
		}
		else
		{
			for (i = 0;i < em;i++)
			{
					sum += a[i];
			}
		}
		  sum = sum - sd; //?????
		  sum = sum + ed;

		  System.out.print(sum);
	  return 0;



	}
}

