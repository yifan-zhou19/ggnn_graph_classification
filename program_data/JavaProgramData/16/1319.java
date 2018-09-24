package <missing>;

public class GlobalMembers
{
	public static void reverse()
	{
		int k;
		if ((k = System.in.read()) == '\n')
		{
			return;
		}
		reverse();
		System.out.printf("%c", k);
	}

	public static int Main()
	{
		reverse();
		return 0;
	}
}
