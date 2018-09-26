package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //???????n???????????p
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 1)
		{
			  if (n % 2 == 0) //??n???????
			  {
				  p = n / 2;
				  System.out.print(n);
				  System.out.print("/2");
				  System.out.print("=");
				  System.out.print(p);
				  System.out.print("\n");
				  n = p; //?p????n
			  }
			  else
			  {
					p = n * 3 + 1;
					System.out.print(n);
					System.out.print("*3");
					System.out.print("+1");
					System.out.print("=");
					System.out.print(p);
					System.out.print("\n");
					n = p;
			  }
		}
		 System.out.print("End");
		 System.out.print("\n");
		 return 0;
	}

}

