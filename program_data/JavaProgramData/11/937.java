package <missing>;

public class GlobalMembers
{
	public static int rui(int y,int m)
	{
	  if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0) && m == 2)
	  {
		return 1;
	  }
	   else
	   {
		   return 0;
	   }
	}
	public static int Main()
	{
	  int d = 0;
	  int y;
	  int m;
	  int r;
	  int i;
	  int[] pp = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 1;i < m;i++)
	   {
		 d = d + pp[i] + rui(y, i);
	   }
		d = d + r;
		System.out.print(d);
		System.out.print("\n");
	   return 0;
	}
}

