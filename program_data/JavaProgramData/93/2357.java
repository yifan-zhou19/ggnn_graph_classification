package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int flag1 = 0;
		int flag2 = 0;
		int flag3 = 0;

		if (num % 3 == 0)
		{
			flag1 = 1;
		}
		if (num % 5 == 0)
		{
			flag2 = 1;
		}
		if (num % 7 == 0)
		{
			flag3 = 1;
		}

		if (flag1 == 1 && flag2 == 1 && flag3 == 1)
		{
			System.out.print("3 5 7");
			System.out.print("\n");
		}
		if (flag1 == 1 && flag2 == 1 && flag3 == 0)
		{
			System.out.print("3 5");
			System.out.print("\n");
		}
		if (flag1 == 1 && flag2 == 0 && flag3 == 1)
		{
			System.out.print("3 7");
			System.out.print("\n");
		}
		if (flag1 == 0 && flag2 == 1 && flag3 == 1)
		{
			System.out.print("5 7");
			System.out.print("\n");
		}
		if (flag1 == 1 && flag2 == 0 && flag3 == 0)
		{
			System.out.print(3);
			System.out.print("\n");
		}
		if (flag1 == 0 && flag2 == 1 && flag3 == 0)
		{
			System.out.print(5);
			System.out.print("\n");
		}
		if (flag1 == 0 && flag2 == 0 && flag3 == 1)
		{
			System.out.print(7);
			System.out.print("\n");
		}
		if (flag1 == 0 && flag2 == 0 && flag3 == 0)
		{
			System.out.print('n');
			System.out.print("\n");
		}
		return 0;
	}

}

