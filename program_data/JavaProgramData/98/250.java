package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String S1 = new String(new char[41]);
		String S2 = new String(new char[41]);
		String s1 = null;
		String s2 = null;
		int N;
		int sum = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		S1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		s1 = S1;
		N = N - 1;
		while (N > 0)
		{
			S2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			s2 = S2;
			int l1 = S1.length();
			int l2 = S2.length();
			sum = sum + l1 + 1 + l2;
			if (sum <= 80)
			{
				for (int i = 0;i < l1;i++)
				{
					System.out.print((s1.Substring(i)));
				}
				System.out.print(' ');
				sum = sum - l2;
				l1 = l2;
				S1 = S2;
			}
			else
			{
				for (int i = 0;i < l1;i++)
				{
					System.out.print((s1.Substring(i)));
				}
				System.out.print("\n");
				sum = 0;
				l1 = l2;
				S1 = S2;
			}
			if (N == 1)
			{
				for (int i = 0;i < l2;i++)
				{
					System.out.print((s2.Substring(i)));
				}
			}
			N--;
		}
		return 0;
	}


}

