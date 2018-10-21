package <missing>;

public class GlobalMembers
{
	public static int jiaogu(int a)
	{
		if (a == 1)
		{
			return 1;
		}
		if (a % 2 == 1 && a != 1)
		{
			System.out.print(a);
			System.out.print("*3+1=");
			System.out.print(a * 3 + 1);
			System.out.print("\n");
			return a * 3 + 1;
		}
		else if (a % 2 == 0)
		{
			System.out.print(a);
			System.out.print("/2=");
			System.out.print(a / 2);
			System.out.print("\n");
			return a / 2;
		}
	}
	public static int Main()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a != 0)
		{
			a = jiaogu(a);
			if (a == 1)
			{
				System.out.print("End");
				System.out.print("\n");
				break;
			}
		}
		return 0;
	}
}

