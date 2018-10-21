package <missing>;

public class GlobalMembers
{
	/*
	 * ????1000012845_0.cpp
	 * ?????2011-1-9
	 * ???????
	 * ????????????????
	 */

	public static int Main()
	{
	   int sy;
	   int sm;
	   int sd;
	   int ey;
	   int em;
	   int ed;
	   int sum = 0;
	   int i;
	   int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   int[] n = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   sy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   sm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   sd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = sy + 1;i < ey;i++)
	   {
		   if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
		   {
			   sum = sum + 366;
		   }
		   else
		   {
			   sum = sum + 365;
		   }
	   }
	   if (ey > sy)
	   {
	   if ((ey % 4 == 0 && ey % 100 != 0) || (ey % 400 == 0))
	   {
		   for (i = 0;i < em - 1;i++)
		   {
			   sum = sum + n[i];
		   }
	   }
	   else
	   {
		   for (i = 0;i < em - 1;i++)
		   {
			   sum = sum + m[i];
		   }
	   }
	   if ((sy % 4 == 0 && sy % 100 != 0) || (sy % 400 == 0))
	   {
		   for (i = 11;i > sm - 1;i--)
		   {
			   sum = sum + n[i];
		   }
		   sum = sum + n[sm - 1] - sd;
	   }
	   else
	   {
		   for (i = 11;i > sm - 1;i--)
		   {
			   sum = sum + m[i];
		   }
		   sum = sum + m[sm - 1] - sd;
	   }
	   }
	   else if ((ey % 4 == 0 && ey % 100 != 0) || (ey % 400 == 0))
	   {
		   if (sm < em)
		   {
			   for (i = sm;i < em - 1;i++)
			   {
				   sum = sum + n[i];
			   }
			   sum = sum + n[sm - 1] - sd;
		   }
		   else
		   {
			   sum = sum - sd;
		   }
	   }
	   else
	   {
		   if (sm < em)
		   {
			   for (i = sm;i < em - 1;i++)
			   {
				   sum = sum + m[i];
			   }
			   sum = sum + m[sm - 1] - sd;
		   }
		   else
		   {
			   sum = sum - sd;
		   }
	   }
	   System.out.print(sum + ed);
	   System.out.print("\n");
	   return 0;
	}

}

