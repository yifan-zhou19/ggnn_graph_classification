package <missing>;

public class GlobalMembers
{
	public static void result(int a,int b)
	{
		if (a == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else if (a % 2 == 1)
		{
			System.out.print(a);
			System.out.print("*3+1=");
			System.out.print(a * 3 + 1);
			System.out.print("\n");
			result(a * 3 + 1, a);

		}
		else if (a % 2 == 0)
		{
			System.out.print(a);
			System.out.print("/2=");
			System.out.print(a / 2);
			System.out.print("\n");
			result(a / 2, a);

		}
	}



	public static int Main()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		result(a, a);
		return 0;
	}


}

