package <missing>;

public class GlobalMembers
{
	/*            ????
	??????        2010.12.06        */

	public static void f(int a)
	{
		if (a == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{
			if (a % 2 != 0)
			{
				System.out.print(a);
				System.out.print("*3+1=");
				System.out.print(3 * a + 1);
				System.out.print("\n");
				f(3 * a + 1); //????3?1
			}
			else
			{
				System.out.print(a);
				System.out.print("/2=");
				System.out.print(a / 2);
				System.out.print("\n");
				f(a / 2); //?????2
			}
		}
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f(n); //???????
		return 0;
	}
}

