package <missing>;

public class GlobalMembers
{
	public static int fabo(int k)
	{
		if (k == 1)
		{
			return 1;
		}
		if (k == 2)
		{
			return 1;
		}
		else
		{
			return fabo(k - 1) + fabo(k - 2);
		}
	}
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fabo(k));
			System.out.print("\n");
			n--;
		}
		return 0;
	}

}

