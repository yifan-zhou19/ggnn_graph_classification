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
	  y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int f = new int(int,int,int);
	  System.out.print(f(y2, m2, d2) - f(y1, m1, d1));
	  System.out.print("\n");
	  return 0;
	}
	public static int f(int y,int m,int d)
	{
	  int num;
	  int i;
	  int j;
	  int k;
	  int s1 = 0;
	  int s2 = 0;
	  int[] c = new int[3100];
	  int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  for (i = 0;i <= 3050;i++)
	  {
	   if (i % 4 != 0 || i % 100 == 0 && i % 400 != 0)
	   {
		   c[i] = 365;
	   }
	   else
	   {
		   c[i] = 366;
	   }
	  }
		 for (i = 0;i <= y - 1;i++)
		 {
	   s1 = s1 + c[i];
		 }
	   for (i = 0;i <= m - 1;i++)
	   {
	   if (y % 4 != 0 || y % 100 == 0 && y % 400 != 0)
	   {
		   s2 = s2 + a[i];
	   }
	   else
	   {
		   s2 = s2 + b[i];
	   }
	   }
	 num = s1 + s2 + d;
	return (num);
	}






}

