package <missing>;

public class GlobalMembers
{
	//???? ??? 20121208

	public static int[] s = new int[111];

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			s[i] = ConsoleInput.readToWhiteSpace(true);
		}
		for (int i = 0;i < n;i++)
		{
			if (i != n - 1)
			{
			System.out.print((s + n - i - 1));
			System.out.print(' ');
			}
			else
			{
			System.out.print((s + n - i - 1));
			}
		}
		return 0;
	}

}

