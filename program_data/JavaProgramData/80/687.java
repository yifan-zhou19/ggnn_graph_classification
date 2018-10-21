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
		int sum1 = 0;
		int sum2 = 0;
		int Sum = 0;
	 int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	 int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	 sy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 sm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 sd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 if ((sy % 100 != 0 && sy % 4 == 0) || (sy % 400 == 0))
		 {
			 for (i = sm;i <= 12;i++)
			 {
				 sum1 = sum1 + b[i];
			 }
		   sum1 = sum1 - sd;
		 }
		 else
		 {
			 for (i = sm;i <= 12;i++)
			 {
				 sum1 = sum1 + a[i];
			 }
		  sum1 = sum1 - sd;
		 }
		 if ((ey % 100 != 0 && ey % 4 == 0) || (ey % 400 == 0))
		 {
			 for (i = em;i <= 12;i++)
			 {
				 sum2 = sum2 + b[i];
			 }
		   sum2 = sum2 - ed;
		 }
		 else
		 {
			 for (i = em;i <= 12;i++)
			 {
				 sum2 = sum2 + a[i];
			 }
		  sum2 = sum2 - ed;
		 }

		 if (sy == ey)
		 {
			 Sum = sum1 - sum2;
		 }
		else
		{
			 for (i = sy + 1;i <= ey;i++)
			 {
				 if ((i % 100 != 0 && i % 4 == 0) || (i % 400 == 0))
				 {
					 Sum = Sum + 366;
				 }
			 else
			 {
				 Sum = Sum + 365;
			 }
			 }
			   Sum = Sum + sum1 - sum2;
		}



	  System.out.print(Sum);

	 return 0;
	}
}

