package <missing>;

public class GlobalMembers
{
	//****************************
	//??3?5?7????
	//****************************
	public static int Main()
	{
	   int n;
	   int a;
	   int b;
	   int c;
	   int sum;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   if (n % 3 == 0)
	   {
		   a = 1;
	   }
		 else
		 {
			 a = 0;
		 }
	   if (n % 5 == 0)
	   {
		   b = 2;
	   }
		 else
		 {
			 b = 0;
		 }
	   if (n % 7 == 0)
	   {
		   c = 5;
	   }
		 else
		 {
			 c = 0;
		 } //????n????3?5?7??
	   sum = a + b + c;
	   if (sum == 0)
	   {
		   System.out.print("n");
	   }
	   else if (sum == 1)
	   {
		   System.out.print("3");
	   }
	   else if (sum == 2)
	   {
		   System.out.print("5");
	   }
	   else if (sum == 5)
	   {
		   System.out.print("7");
	   }
	   else if (sum == 3)
	   {
		   System.out.print("3");
		   System.out.print(" ");
		   System.out.print("5");
	   }
	   else if (sum == 6)
	   {
		   System.out.print("3");
		   System.out.print(" ");
		   System.out.print("7");
	   }
	   else if (sum == 7)
	   {
		   System.out.print("5");
		   System.out.print(" ");
		   System.out.print("7");
	   }
	   else if (sum == 8)
	   {
		   System.out.print("3");
		   System.out.print(" ");
		   System.out.print("5");
		   System.out.print(" ");
		   System.out.print("7");
	   }
	   return 0;
	}
}

