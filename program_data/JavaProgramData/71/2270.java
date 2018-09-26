package <missing>;

public class GlobalMembers
{
	public static int judge(int year,int a,int b)
	{
		int[][] day =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
	 int d = 0;
	 int i;
	 int flag;
	 int max;
	 int min;
	 if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
	 {
	   flag = 1;
	 }
	 else
	 {
		 flag = 0; //????
	 }
	 if (a == b)
	 {
		 return 1;
	 }
	 else
	 {
	  max = (a > b)?a:b;
	  min = (a < b)?a:b;
	  for (i = min;i < max;i++)
	  {
	   d += day[flag][i - 1];
	  }
	  if (d % 7 == 0)
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
		int year;
		int a;
		int b;
		int i;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 1;i <= n;i++)
	 {
		 year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  if (judge(year, a, b) != 0)
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

