package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int year;
		int month1;
		int month2;
		int day = 0;
		int[] a = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			day = 0;
				  year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				  month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				  month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				  if (month1 > month2)
				  {
					  i = month1;
					  month1 = month2;
					  month2 = i;
				  }
				  if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				  {
				  for (i = month1 - 1;i < month2 - 1;i++)
				  {
				  day = day + a[i];
				  }
				  }
				  else
				  {
					  for (i = month1 - 1;i < month2 - 1;i++)
					  {
				  day = day + a[i];
					  }
				  if (month1 <= 2 && month2>2)
				  {
					  day = day - 1;
				  }
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

