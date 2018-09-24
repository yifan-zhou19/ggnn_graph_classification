package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] p = a;
		for (int i = 0;i < n;i++)
		{
			p[0]++ = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			if (i != 0)
			{
				System.out.print(" ");
			}
			System.out.print(--p);
		}

		return 0;
	}
}

