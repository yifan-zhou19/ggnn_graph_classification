package <missing>;

public class GlobalMembers
{
	public static int odd(int a)
	{
		System.out.print(a);
		System.out.print("*3+1=");
		a = a * 3 + 1;
		System.out.print(a);
		System.out.print("\n");
		return a;
	}
	public static int even(int a)
	{
		System.out.print(a);
		System.out.print("/2=");
		a = a / 2;
		System.out.print(a);
		System.out.print("\n");
		return a;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 1) //???1???????
		{
			if (n % 2 == 0)
			{
				n = even(n);
			}
			else
			{
				n = odd(n);
			}
		}
		System.out.print("End");

		return 0;
	}
}

