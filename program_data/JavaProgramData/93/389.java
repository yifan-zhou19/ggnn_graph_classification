package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n; //n??????
	  int i = 0;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  if (n % 3 == 0)
	  {
		  i++;
	  }
	  if (n % 5 == 0)
	  {
		  i++;
	  }
	  if (n % 7 == 0)
	  {
		  i++;
	  }
	  if (i == 3)
	  {
		  System.out.print("3 5 7");
	  }
	  if (i == 2)
	  {
			  if (n % 3 != 0)
			  {
				  System.out.print("5 7");
			  }
			  if (n % 5 != 0)
			  {
				  System.out.print("3 7");
			  }
			  if (n % 7 != 0)
			  {
				  System.out.print("3 5");
			  }
	  }
	  if (i == 1)
	  {
			  if (n % 3 == 0)
			  {
				  System.out.print("3");
			  }
			  if (n % 5 == 0)
			  {
				  System.out.print("5");
			  }
			  if (n % 7 == 0)
			  {
				  System.out.print("7");
			  }
	  }
	  if (i == 0)
	  {
		  System.out.print("n");
	  }
	  System.in.read();
	  System.in.read();
	  return 0;
	}
}

