package <missing>;

public class GlobalMembers
{
	public static int f1(int a)
	{
		int b;
		b = a / 2;
		System.out.print(a);
		System.out.print("/2=");
		System.out.print(b);
		System.out.print("\n");
		a = b;
		return a;
	}

	public static int f2(int a)
	{
		int b;
		b = a * 3 + 1;
		System.out.print(a);
		System.out.print("*3+1=");
		System.out.print(b);
		System.out.print("\n");
		a = b;
		return a;
	}

	public static int Main()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a != 1)
		{
			if ((a % 2) == 0)
			{
				a = f1(a);
			}
			else
			{
				a = f2(a);
			}
		}
		System.out.print("End");
		System.out.print("\n");
		System.in.read();
		System.in.read();
		return 0;
	}
}

