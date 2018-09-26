package <missing>;

public class GlobalMembers
{
	public static int temp(int x) //????

	{
		if (x % 2 == 1)
		{
		System.out.print(x);
		System.out.print("*3+1=");
		System.out.print(x * 3 + 1);
		System.out.print("\n");
		return x * 3 + 1;
		}
		else
		{
		System.out.print(x);
		System.out.print("/2=");
		System.out.print(x / 2);
		System.out.print("\n");
		return x / 2;
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 1)
		{
			n = temp(n);
		}
		System.out.print("End");
		System.out.print("\n");
		System.in.read();
		System.in.read();
		return 0;
	}
}

