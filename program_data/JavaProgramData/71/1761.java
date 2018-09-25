package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int x;
		int y;
		int z;
		int day = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		while (n > 0)
		{
		   x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   if ((x % 4 == 0 && x % 100 != 0) || x % 400 == 0)
		   {
			   if (y < z)
			   {
				   for (i = y;i < z;i++)
				   {
				  day += b[i];
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
			   else
			   {
				   for (i = z;i < y;i++)
				   {
				  day += b[i];
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
		   }
		   else
		   {
			   if (y < z)
			   {
				   for (i = y;i < z;i++)
				   {
				  day += a[i];
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
			   else
			   {
				   for (i = z;i < y;i++)
				   {
				  day += a[i];
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
		   }
		   day = 0;
		   n--;
		}
		return 0;
	}

}

