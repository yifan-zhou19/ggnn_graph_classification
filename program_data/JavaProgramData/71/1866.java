package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0; //a=1???a=2????day?????????????????
		int year = 0;
		int month1 = 0;
		int month2 = 0;
		int a = 0;
		int day = 0;
		int i = 0;
		int j = 0;
		int[] b = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //??b??????

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (j < n) //???n?
		{
				j++;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   if (year % 100 == 0) //????????
		   {
			   if (year % 400 == 0)
			   {
				   a = 1;
			   }
			   else
			   {
				   a = 2;
			   }
		   }
		   else if (year % 4 == 0)
		   {
			   a = 1;
		   }
				else
				{
					a = 2;
				}

				month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 1) //??
			{
			b[1] = 29;
			}
			else //??
			{
			b[1] = 28;
			}

			day = 0;
			for (i = Math.min(month1,month2);i <= Math.max(month1,month2) - 1;i++)
			{
				day = day + b[i - 1];
			}


			if (day % 7 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

