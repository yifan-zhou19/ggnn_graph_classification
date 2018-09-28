package <missing>;

public class GlobalMembers
{
	public static int i = 0;
	public static int n;
	public static int f()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i++; //???????????????
		if (i == n)
		{
			System.out.print(a);
			return 0;
		} //?????????????????
		if (i != n)
		{
			f();
		} //?????????????????
		System.out.print(" ");
		System.out.print(a);
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f();
		return 0;
	}
}

