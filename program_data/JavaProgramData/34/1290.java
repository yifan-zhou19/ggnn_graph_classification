package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n; //?????
	  int temp; //??????
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  while (n != 1)
	  {
		  if (n % 2 == 0)
		  {
			  temp = n / 2;
			  System.out.print(n);
			  System.out.print("/");
			  System.out.print("2");
			  System.out.print("=");
			  System.out.print(temp);
			  System.out.print("\n");
		  }
		  if (n % 2 != 0)
		  {
			  temp = n * 3 + 1;
			  System.out.print(n);
			  System.out.print("*");
			  System.out.print("3");
			  System.out.print("+");
			  System.out.print("1");
			  System.out.print("=");
			  System.out.print(temp);
			  System.out.print("\n");
		  }
		  n = temp;
	  }
	  if ((n = 1) != 0)
	  {
		  System.out.print("End");
	  }

	  return 0;
	}
}

