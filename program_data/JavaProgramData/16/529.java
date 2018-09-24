package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n >= 10000)
		{
			System.out.print("00001");
			System.out.print("\n");
		}
		else if (n >= 1000)
		{
			System.out.print(n % 10);
			System.out.print((n - n % 10) / 10 % 10);
			System.out.print((n - n % 100) / 100 % 10);
			System.out.print((n - n % 1000) / 1000 % 10);
			System.out.print("\n");
		}
			 else if (n >= 100)
			 {
				 System.out.print(n % 10);
				 System.out.print((n - n % 10) / 10 % 10);
				 System.out.print((n - n % 100) / 100 % 10);
				 System.out.print("\n");
			 }
				   else if (n >= 10)
				   {
					   System.out.print(n % 10);
					   System.out.print((n - n % 10) / 10 % 10);
					   System.out.print("\n");
				   }
						else
						{
							System.out.print(n);
							System.out.print("\n");
						}
		return 0;
	}


}

