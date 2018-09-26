package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int guocheng = int n;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{
			guocheng(n);
			System.out.print("End");
			System.out.print("\n");
		}
		return 0;
	}
	 public static int guocheng(int n)
	 {
		int n1 = 0;
		while (n != 1)
		{
			if (n % 2 == 0)
			{
				n1 = n / 2;
				System.out.print(n);
				System.out.print("/2=");
				System.out.print(n1);
				System.out.print("\n");
				n = n1;
			}
			else
			{
				n1 = 3 * n + 1;
				System.out.print(n);
				System.out.print("*3+1=");
				System.out.print(n1);
				System.out.print("\n");
				n = n1;
			}
		}
	 }

}

