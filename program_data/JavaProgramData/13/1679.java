package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[101];
		int n;
		int i;
		int x;

		for (i = 0;i <= 100;i++)
		{
			s[i] = 0;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (s[x] == 0)
		{
			if (i > 0)
			{
				System.out.print(' ');
			}
			System.out.print(x);
			s[x] = 1;
		}
		}


		return 0;
	}
}

