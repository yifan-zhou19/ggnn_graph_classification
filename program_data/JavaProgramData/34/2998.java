package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0; //??????;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int yushu = 0;
		yushu = a % 2;
		for (;a != 1;)
		{
		if (yushu == 0)
		{
			System.out.print(a);
			System.out.print("/2=");
			System.out.print((a * 0.5));
			System.out.print("\n");
			a = a / 2;
			yushu = a % 2;
		}
		else
		{
			System.out.print(a);
			System.out.print("*3+1=");
			System.out.print((a * 3 + 1));
			System.out.print("\n");
			a = a * 3 + 1;
			yushu = a % 2;
		}
		}
		System.out.print("End");
		System.out.print("\n");
		return 0;
	}
}

