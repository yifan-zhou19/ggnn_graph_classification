package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int a;
	  while (n > 1)
	  {
		if (n % 2 == 1)
		{
		 a = n * 3 + 1;
		 System.out.print(n);
		 System.out.print("*");
		 System.out.print(3);
		 System.out.print("+");
		 System.out.print(1);
		 System.out.print("=");
		 System.out.print(a);
		 System.out.print("\n");
		 n = a;
		}
		else
		{
		  a = n / 2;
		  System.out.print(n);
		  System.out.print("/");
		  System.out.print(2);
		  System.out.print("=");
		  System.out.print(a);
		  System.out.print("\n");
		  n = a;
		}
	  }
	   System.out.print("End");
	   System.out.print("\n");
	   System.in.read();
	   System.in.read();
	   System.in.read();
	   return 0;
	}

}

