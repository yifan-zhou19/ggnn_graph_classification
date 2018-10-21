package <missing>;

public class GlobalMembers
{
	/**
	????5
	?  ?????
	?  ??9.28
	?  ????3?5?7????
	*/

	public static int Main()

	{
	   int x;
	   int a;
	   int b;
	   int c;
	   x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	   a = (x % 3 == 0);
	   b = (x % 5 == 0);
	   c = (x % 7 == 0);

	   if (a + b + c == 3)
	   {
		   System.out.print("3 5 7");
		   System.out.print("\n");
	   }
	   else if (a + b + c == 2)
	   {
		   if (c == 0)
		   {
			   System.out.print("3 5");
			   System.out.print("\n");
		   }
		   else if (b == 0)
		   {
			   System.out.print("3 7");
			   System.out.print("\n");
		   }
		   else
		   {
			   System.out.print("5 7");
			   System.out.print("\n");
		   }
	   }
	   else if (a + b + c == 1)
	   {
		   if (a == 1)
		   {
			   System.out.print("3");
			   System.out.print("\n");
		   }
		   else if (b == 1)
		   {
			   System.out.print("5");
			   System.out.print("\n");
		   }
		   else
		   {
			   System.out.print("7");
			   System.out.print("\n");
		   }
	   }
	   else
	   {
		   System.out.print("n");
		   System.out.print("\n");
	   }

	   return 0;
	}




}

