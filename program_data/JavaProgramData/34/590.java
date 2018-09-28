package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static void change(int n)
	{

		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{
			if (n % 2 == 0)
			{
				System.out.print(n);
				System.out.print('/');
				System.out.print(2);
				System.out.print('=');
				System.out.print(n / 2);
				System.out.print("\n");
				change(n / 2);
			}
			else
			{
				System.out.print(n);
				System.out.print('*');
				System.out.print(3);
				System.out.print('+');
				System.out.print(1);
				System.out.print('=');
				System.out.print(n * 3 + 1);
				System.out.print("\n");
				change(n * 3 + 1);
			}
		}
	}













	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		change(n);





















		return 0;
	}
}

