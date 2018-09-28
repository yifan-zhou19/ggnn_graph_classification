package <missing>;

public class GlobalMembers
{
	public static void num(int a)
	{
		int m;
		do
		{
			if (a % 2 != 0)
			{
				m = a;
				a = a * 3 + 1;
				System.out.print(m);
				System.out.print("*3+1=");
				System.out.print(a);
				System.out.print('\n');
			}
			else
			{
				m = a;
				a = a / 2;
				System.out.print(m);
				System.out.print("/2=");
				System.out.print(a);
				System.out.print('\n');
			}
		} while (a > 1);
		if (a == 1)
		{
			System.out.print("End");
		}
	}

	public static int Main()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a == 1)
		{
			System.out.print("End");
		}
		else
		{
			num(a);
		}
		return 0;
	}


}

