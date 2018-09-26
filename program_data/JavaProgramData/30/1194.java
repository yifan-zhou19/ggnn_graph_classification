package <missing>;

public class GlobalMembers
{
	/*??:???
	??:1100012822
	??:2011.9.28
	??:?7???????.cpp*/


	public static int Main()
	{
		int n;
		int i = 1;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i <= n)
		{
			if ((i - 7) % 10 == 0 || i % 7 == 0 || (i >= 70 && i < 80))
			{
				i += 1;
			}
			else
			{
				s += i * i;
				i += 1;
			}
		}
		System.out.print(s);
		System.out.print("\n");

		return 0;
	}
}

