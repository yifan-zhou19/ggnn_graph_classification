package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int Na;
		int Nb;
		int Nc;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Na = a % 3;
		Nb = a % 5;
		Nc = a % 7;
		if (Na == 0 && Nb == 0 && Nc == 0)
		{
		  System.out.print("3 5 7");
		}
		else
		{
		  if (Na == 0 && Nb == 0)
		  {
			 System.out.print("3 5");
		  }
		  else
		  {
			 if (Na == 0 && Nc == 0)
			 {
				System.out.print("3 7");
			 }
			 else
			 {
				 if (Nb == 0 && Nc == 0)
				 {
					System.out.print("5 7");
				 }
				 else
				 {
				   if (Na == 0)
				   {
					 System.out.print("3");
				   }
				   else
				   {
					 if (Nb == 0)
					 {
						System.out.print("5");
					 }
					 else
					 {
					   if (Nc == 0)
					   {
						 System.out.print("7");
					   }
					   else
					   {
						 System.out.print("n");
					   }
					 }
				   }
				 }
			 }
		  }
		}
		 return 0;
	}
}

