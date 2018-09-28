package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int judge = 0;
		int[] dayofmonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0};
	  int year;
	  int month1;
	  int month2;
	for (int inputtime = 1;inputtime <= n;inputtime++)
	{
		judge = 0;
	  year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  dayofmonth[1] = 28;
	  if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
	  {
		  dayofmonth[1] = 29;
	  }
	 for (int i = Math.min(month1,month2) - 1;i < Math.max(month1,month2) - 1;i++)
	 {
		 judge += dayofmonth[i];
	 }

	 if (judge % 7 == 0)
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

