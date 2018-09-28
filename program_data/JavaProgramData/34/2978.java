package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static void jisuan()
	{

	 while (n != 1)
	 {
			if (n % 2 != 0)
			{
				m = n * 3 + 1;
				System.out.print(n);
				System.out.print("*3+1=");
				System.out.print(m);
				System.out.print("\n");
				n = m;
			}
			if (n % 2 == 0)
			{
				m = n / 2;
				System.out.print(n);
				System.out.print("/2=");
				System.out.print(m);
				System.out.print("\n");
				n = m;
			}
	 }
	}
	public static int Main()
	{

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1) //??n???1
		{
		System.out.print("End");
		}
		if (n != 1) //n??1?
		{
		jisuan();
		System.out.print("End");
		}
		return 0;
	}

}

