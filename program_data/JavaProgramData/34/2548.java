package <missing>;

public class GlobalMembers
{
	public static int jiaogu(int a)
	{
		 if (a == 1)
		 {
				 System.out.print("End");
				 System.out.print("\n");
				 return 0;
		 }
		 else
		 {
			 if (a % 2 == 0)
			 {
				   System.out.print(a);
				   System.out.print("/");
				   System.out.print(2);
				   System.out.print("=");
				   System.out.print(a / 2);
				   System.out.print("\n");
				   return jiaogu(a / 2);
			 }
			 else
			 {
				 System.out.print(a);
				 System.out.print("*");
				 System.out.print(3);
				 System.out.print("+");
				 System.out.print(1);
				 System.out.print("=");
				 System.out.print((a * 3 + 1));
				 System.out.print("\n");
				 return jiaogu(a * 3 + 1);
			 }
		 }
	}

	public static int Main()
	{
		int number;
		number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		jiaogu(number);
		return 0;
	}

}

