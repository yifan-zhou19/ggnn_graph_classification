package <missing>;

public class GlobalMembers
{
	public static void dol(int a)
	{
		System.out.print(a);
		System.out.print("/2=");
		System.out.print(a / 2);
		System.out.print("\n");
		if ((a / 2) % 2 == 0)
		{
			dol(a / 2);
		}
		else
		{
			sgl(a / 2);
		}
	}
	public static void sgl(int a)
	{
		if (a == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{
			System.out.print(a);
			System.out.print("*3+1=");
			System.out.print(a * 3 + 1);
			System.out.print("\n");
			dol(a * 3 + 1);
		}
	}
	public static int Main()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a % 2 == 1)
		{
			sgl(a);
		}
		else
		{
			dol(a);
		}
		return 0;
	}
}

