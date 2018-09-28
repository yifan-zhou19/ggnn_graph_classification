package <missing>;

public class GlobalMembers
{
	//????
	public static int guess(int num)
	{
		if (num == 1)
		{
			System.out.print("End");
			System.out.print("\n");
			return 1;
		}
		if (num != 1)
		{
			if (num % 2 == 0)
			{
				System.out.print(num);
				System.out.print("/2=");
				System.out.print(num / 2);
				System.out.print("\n");
				return guess(num / 2);
			}
			if (num % 2 != 0)
			{
				System.out.print(num);
				System.out.print("*3+1=");
				System.out.print(3 * num + 1);
				System.out.print("\n");
				return guess(3 * num + 1);
			}
		}
	}
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		guess(n);
		return 0;
	}
}

