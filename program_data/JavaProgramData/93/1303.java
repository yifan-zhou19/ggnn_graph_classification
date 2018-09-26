package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (!(i % 3) && !(i % 5) && !(i % 7))
	{
			System.out.print("3 5 7");
			System.out.print("\n");
	}
			else if (!(i % 3) && !(i % 5))
			{
				System.out.print("3 5");
				System.out.print("\n");
			}
				else if (!(i % 5) && !(i % 7))
				{
			  System.out.print("5 7");
			  System.out.print("\n");
				}
			  else if (!(i % 3) && !(i % 7))
			  {
			 System.out.print("3 7");
			 System.out.print("\n");
			  }
			 else if (!(i % 3))
			 {
			System.out.print("3");
			System.out.print("\n");
			 }
			else if (!(i % 5))
			{
		  System.out.print("5");
		  System.out.print("\n");
			}
		  else if (!(i % 7))
		  {
		 System.out.print("7");
		 System.out.print("\n");
		  }
		 else
		 {
			 System.out.print("n");
		 }
		 return 0;
	}

}

