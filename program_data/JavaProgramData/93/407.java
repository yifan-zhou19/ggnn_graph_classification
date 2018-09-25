package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int b = 3;
	  int c = 5;
	  int d = 7;
	  if (a % b == 0 && a % c == 0 && a % d == 0)
	  {
		  System.out.print(3);
		  System.out.print(" ");
		  System.out.print(5);
		  System.out.print(" ");
		  System.out.print(7);
		  System.out.print("\n");
	  }

	   else if (a % b == 0 && a % c == 0)
	   {
		   System.out.print(3);
		   System.out.print(" ");
		   System.out.print(5);
		   System.out.print("\n");
	   }

		else if (a % b == 0 && a % d == 0)
		{
			System.out.print(3);
			System.out.print(" ");
			System.out.print(7);
			System.out.print("\n");
		}

		 else if (a % c == 0 && a % d == 0)
		 {
			 System.out.print(5);
			 System.out.print(" ");
			 System.out.print(7);
			 System.out.print("\n");
		 }

		  else if (a % b == 0)
		  {
			  System.out.print(3);
			  System.out.print("\n");
		  }

		   else if (a % c == 0)
		   {
			   System.out.print(5);
			   System.out.print("\n");
		   }

			else if (a % d == 0)
			{
				System.out.print(7);
				System.out.print("\n");
			}
			  else
			  {
				  System.out.print("n");
				  System.out.print("\n");
			  }

	  System.in.read();
	  System.in.read();
	  System.in.read();
	  return 0;
	}

}

