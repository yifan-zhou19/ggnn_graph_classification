package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void f(int a);
		int n;
		int num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f(n - 1);
		System.out.print(num);
		return 0;
	}
	public static void f(int a)
	{
		 int num;
		 num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 if (a > 0)
		 {
		 f(a - 1);
		 System.out.print(num);
		 System.out.print(" ");
		 }
	}

}

