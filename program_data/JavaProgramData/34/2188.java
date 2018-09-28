package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (flag == 0)
		{
			if (n == 1)
			{
				System.out.print("End");
				flag = 1;
			}
			else if (n % 2 != 0 && n != 1)
			{
				m = n;
				n = n * 3 + 1;
				System.out.print(m);
				System.out.print('*');
				System.out.print(3);
				System.out.print('+');
				System.out.print(1);
				System.out.print('=');
				System.out.print(n);
				System.out.print("\n");
			}
			if (n % 2 == 0)
			{
				m = n;
				n = n / 2;
				System.out.print(m);
				System.out.print('/');
				System.out.print(2);
				System.out.print('=');
				System.out.print(n);
				System.out.print("\n");
				if (n == 1)
				{
					System.out.print("End");
					flag = 1;
				}
				else
				{
					flag = 0;
				}
			}
		}
		return 0;
	}

}

