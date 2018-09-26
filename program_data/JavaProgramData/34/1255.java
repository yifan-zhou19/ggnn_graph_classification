package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int n; //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 1) //????
		{
			if (n % 2 == 1) //????
			{
				System.out.print(n);
				System.out.print("*3");
				System.out.print("+1=");
				System.out.print(3 * n + 1);
				System.out.print('\n',n = 3 * n + 1);
			}
			else //????
			{
				System.out.print(n);
				System.out.print("/2=");
				System.out.print(n / 2);
				System.out.print('\n',n /= 2);
			}
		}
		System.out.print("End");
		System.out.print("\n");
		return 0; //???????????????????

	}

}

