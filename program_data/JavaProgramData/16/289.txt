package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int n;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 if (n / 10 < 1)
	 {
		 System.out.print(n);
		 System.out.print("\n");
	 }
	  else
	  {
		  d = n % 10;
		   n = n / 10;
		   if (n / 10 < 1)
		   {
		   System.out.print(d);
		   System.out.print(n);
		   System.out.print("\n");
		   }
		   else
		   {
			   c = n % 10;
				n = n / 10;
				if (n / 10 < 1)
				{
				System.out.print(d);
				System.out.print(c);
				System.out.print(n);
				System.out.print("\n");
				}
				else
				{
					b = n % 10;
					 n = n / 10;
					 if (n / 10 < 1)
					 {
					 System.out.print(d);
					 System.out.print(c);
					 System.out.print(b);
					 System.out.print(n);
					 System.out.print("\n");
					 }
					 else
					 {
						 a = n % 10;
						  n = n / 10;
						  if (n / 10 < 1)
						  {
						  System.out.print(d);
						  System.out.print(c);
						  System.out.print(b);
						  System.out.print(a);
						  System.out.print(n);
						  System.out.print("\n");
						  }
					 }
				}
		   }
	  }
	  return 0;
	}
}

