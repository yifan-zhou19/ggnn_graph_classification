package <missing>;

public class GlobalMembers
{
	/*
	 *???: 1.cpp
	 *??????
	 *????: 2012-11-18
	 *??: ????
	 */


	public static void Try(int x)
	{
		if (x != 1)
		{
			if (x % 2 == 0)
			{
				System.out.print(x);
				System.out.print("/2=");
				System.out.print(x / 2);
				System.out.print("\n");
				x /= 2;
			} //?1??
			else if (x % 2 != 0)
			{
				System.out.print(x);
				System.out.print("*3+1=");
				System.out.print(x * 3 + 1);
				System.out.print("\n");
				x *= 3;
				x++;
			} //?1??
			Try(x);
		}
		else if (x == 1)
		{
			System.out.print("End");
			System.out.print("\n");
			return;
		} //1???
	}

	public static int Main()
	{
		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Try(x);
		return 0;
	}
}

