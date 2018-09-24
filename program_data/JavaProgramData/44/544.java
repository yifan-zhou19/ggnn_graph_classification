package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
//C++ TO JAVA CONVERTER TODO TASK: The following statement was not recognized, possibly due to an unrecognized macro:
	void get();
	public static void fanxu(int n)
	{
		if (n > 0)
		{
			if (n % 10 != 0 || i == 1)
			{
				System.out.print((n % 10),i = 1);
			}
			fanxu(n / 10);
		}
		else
		{
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		int j;
		for (j = 1;j <= 6;j++)
		{
			get();
			i = 0;
			fanxu(n);
		}
		return 0;
	}
	public static void get()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n < 0)
		{
			System.out.print("-",n = -n);
		}
		if (n == 0)
		{
			System.out.print("0");
		}
	}
}

