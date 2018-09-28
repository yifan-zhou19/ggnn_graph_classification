package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a != 1)
		{
		if (a % 2 == 1)
		{
		System.out.print(a);
		System.out.print("*3+1=");
		a = a * 3 + 1;
		System.out.print(a);
		System.out.print("\n");
		}
		else
		{
		System.out.print(a);
		System.out.print("/2=");
		a = a / 2;
		System.out.print(a);
		System.out.print("\n");
		}
		}
		System.out.print("End");
		System.out.print("\n");
	}


}

