package <missing>;

public class GlobalMembers
{
	public static int ji(int x)
	{
		System.out.print(x);
		System.out.print("*3+1=");
		System.out.print(x * 3 + 1);
		System.out.print("\n");
		return (x * 3 + 1);
	}
	 public static int ou(int x)
	 {
		 System.out.print(x);
		 System.out.print("/2=");
		 System.out.print(x / 2);
		 System.out.print("\n");
		 return (x / 2);
	 }
	 public static int Main()
	 {
		 int n;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 while (n != 1)
		 {
			 if (n % 2 == 1)
			 {
				 n = ji(n);
				 continue;
			 }
			 else
			 {
				 n = ou(n);
				 continue;
			 }
		 }
			 if (n == 1)
			 {
				 System.out.print("End");
				 System.out.print("\n");
			 }
		 return 0;
	 }
}

