package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1;i < 10000;i++)
		{
			if (a == 1)
			{
			System.out.print("End");
			System.out.print("\n");
		return 0;
			}


		else if (a % 2 == 0)
		{
			b = a / 2;
		System.out.print(a);
		System.out.print("/2=");
		System.out.print(b);
		System.out.print("\n");
		a = b;
		}
		else
		{
			b = 3 * a + 1;
		System.out.print(a);
		System.out.print("*3+1=");
		System.out.print(b);
		System.out.print("\n");
		a = b;
		}
		}
		return 0;
	}
}

