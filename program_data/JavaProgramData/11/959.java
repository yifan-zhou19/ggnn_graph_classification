package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int y;
	   int m;
	   int d;
	   int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   int[] b = new int[12];
	   int i;
	   y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   if (y % 4 != 0 || y % 100 == 0 && y % 400 != 0)
	   {
		   a[1] = 28;
	   }
	   else
	   {
		   a[1] = 29;
	   }
	   for (i = 1;i < 12;i++)
	   {
		   b[0] = a[0];
		   b[i] = b[i - 1] + a[i];
	   }
	   if (m == 1)
	   {
		   System.out.print(d);
		   System.out.print("\n");
	   }
	   else if (m != 1)
	   {
		   System.out.print(b[m - 2] + d);
		   System.out.print("\n");
	   }
	   return 0;
	}
}

