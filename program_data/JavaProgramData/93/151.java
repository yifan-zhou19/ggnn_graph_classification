package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int m;
	   int p;
	   while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
	   {
		   m = 0;
		   p = 0;
		   for (i = 3;i <= 7;i += 2)
		   {
			   if (n % i == 0)
			   {
				   m++;
			   }
		   }
		   if (m == 3)
		   {
			   System.out.print("3 5 7");
			   System.out.print("\n");
		   }
		   else if (m == 1)
		   {
			   for (i = 3;i <= 7;i += 2)
			   {
			   if (n % i == 0)
			   {
				   System.out.print(i);
				   System.out.print("\n");
			   }
			   }
		   }
		   else if (m == 2)
		   {
			   for (i = 3;i <= 7;i += 2)
			   {
				   if (n % i == 0 && p == 0)
				   {
					   System.out.print(i);
					   System.out.print(" ");
					   p++;
				   }
				   else if (n % i == 0 && p != 0)
				   {
					   System.out.print(i);
					   System.out.print("\n");
				   }
			   }
		   }
		   else if (m == 0)
		   {
			   System.out.print("n");
			   System.out.print("\n");
		   }
	   }
	return 0;
	}
}

