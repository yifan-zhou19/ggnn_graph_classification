package <missing>;

public class GlobalMembers
{
	public static int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int is_year(int x)
	{

		if (x % 4 != 0)
		{
		   return 0;
		}
		  else if ((x % 4 == 0) && (x % 100 != 0))
		  {
			return 1;
		  }
		  else
		  {
			  if (x % 400 == 0)
			  {
				  return 1;
			  }
			  else
			  {
				  return 0;
			  }
		  }
	}
	public static int Main()
	{
	  int n;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (int i = 0;i < n;i++)
	  {
		  int year;
		  int month1;
		  int month2;
		  int day1 = 1;
		  int day2 = 1;
		  year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  if (is_year(year) != 0)
		  {
			  m[2] = 29;
		  }
		  for (int i = 1;i < month1;i++)
		  {
			  day1 += m[i];
		  }
		  for (int i = 1;i < month2;i++)
		  {
			  day2 += m[i];
		  }
		  m[2] = 28;
		  if ((Math.abs(day2 - day1)) % 7 == 0)
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

