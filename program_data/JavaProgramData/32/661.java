package <missing>;

public class GlobalMembers
{
	/*
	 * ???: 1000010191_test4_2.cpp
	 * ??: ???
	 * ????: 2010-12-24
	 * ??: ?????
	 */


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1;k <= n;k++)
		{
			//??
			String sa = new String(new char[101]);
			String sb = new String(new char[101]);
			sa = ConsoleInput.readToWhiteSpace(true).charAt(0);
			sb = ConsoleInput.readToWhiteSpace(true).charAt(0);
			//??
			int la = sa.length();
			int lb = sb.length();
			//??
			int[] a = new int[101];
			int[] b = new int[101];
			for (int i = 1;i <= la;i++)
			{
				a[i] = sa.charAt(la - i) - '0';
			}
			for (int i = 1;i <= lb;i++)
			{
				b[i] = sb.charAt(lb - i) - '0';
			}
			//??
			for (int i = 1;i <= la;i++)
			{
				a[i] -= b[i];
				if (a[i] < 0)
				{
					a[i] += 10;
					a[i + 1]--;
				}
			}
			//??
			while (a[la] == 0)
			{
				la--;
			}
			for (int i = la;i > 0;i--)
			{
				System.out.print(a[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

