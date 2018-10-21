package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int a;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x == 0)
		{
			System.out.print("0");
		}
		else
		{
			while (x != 0)
			{
				a = x % 10;
				x = x / 10;
				System.out.print(a);
			}
		}
		System.in.read();
		System.in.read(); //????
		return 0;
	}
}

