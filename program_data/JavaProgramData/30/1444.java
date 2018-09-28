package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int ans = 0;
		String s = new String(new char[4]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			s = String.format("%d", i);
			if ((s.charAt(0) != '7') && (s.charAt(1) != '7') && (s.charAt(2) != '7') && (s.charAt(3) != '7') && (i % 7 != 0))
			{
				ans += i * i;
			}
		}
		System.out.print(ans);
		System.out.print("\n");
		return 0;
	}
}

