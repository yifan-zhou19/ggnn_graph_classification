package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 1) //???????
		{
			if (n % 2 == 0)
			{
				System.out.print(n);
				System.out.print("/2=");
				System.out.print(n / 2);
				System.out.print("\n");
				n = n / 2;
				if (n == 1)
				{
					break;
				}
			}
			if (n % 2 != 0)
			{
				System.out.print(n);
				System.out.print("*3+1=");
				System.out.print(n * 3 + 1);
				System.out.print("\n");
				n = n * 3 + 1;
				if (n == 1)
				{
					break;
				}
			}
		}
		System.out.print("End");


		return 0;
	}
}

