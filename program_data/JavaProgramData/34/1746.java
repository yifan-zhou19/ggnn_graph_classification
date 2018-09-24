package <missing>;

public class GlobalMembers
{
	public static void jg(int a)
	{
		   int t = 0;
		if (a == 1)
		{
			System.out.print("End");
		}
		else if (a % 2 == 1)
		{
			t = a * 3 + 1;
		System.out.print(a);
		System.out.print("*3+1=");
		System.out.print(t);
		System.out.print("\n");
			jg(t);
		}
			else
			{
				t = a / 2;
				System.out.print(a);
				System.out.print("/2=");
				System.out.print(t);
				System.out.print("\n");
				jg(t);
			}
	}

	public static int Main()
	{
		int a = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		jg(a);
		return 0;
	}
}

