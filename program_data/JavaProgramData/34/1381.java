package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int gujiao = int n;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		gujiao(n);
		return 0;
	}
	public static int gujiao(int n)
	{
		if (n == 2)
		{
			  System.out.print("2/2=1");
			  System.out.print("\n");
			  System.out.print("End");
			  System.out.print("\n");
		}
		else
		{
			 if (n % 2 == 0)
			 {
					System.out.print(n);
					System.out.print("/2=");
					System.out.print(n / 2);
					System.out.print("\n");
					return gujiao(n / 2);
			 }
			 else
			 {
				  if (n == 1)
				  {
						System.out.print("End");
						System.out.print("\n");
				  }
				  else
				  {
					   System.out.print(n);
					   System.out.print("*3+1=");
					   System.out.print(n * 3 + 1);
					   System.out.print("\n");
					   return gujiao(n * 3 + 1);
				  }
			 }
		}
	}

}

