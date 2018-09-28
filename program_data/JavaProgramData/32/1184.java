package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????   **
	//*?????? 1300012713 **
	//*???2013.11.15  **
	//********************************
	public static int Main()
	{
		String a = new String(new char[105]);
		String b = new String(new char[105]);
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int m = 1; m <= n; m++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int[] aa = new int[105];
			int[] bb = new int[105];
			int aline = a.length();
			int bline = b.length();
			for (int i = 1; i <= aline; i++)
			{
				aa[aline - i + 1] = a.charAt(i - 1) - '0';
			}
			for (int j = 1; j <= bline; j++)
			{
				bb[bline - j + 1] = b.charAt(j - 1) - '0';
			}
			for (int k = 1; k <= aline; k++)
			{
				if (aa[k] >= bb[k])
				{
					aa[k] = aa[k] - bb[k];
				}
				else
				{
					aa[k] = aa[k] - bb[k] + 10;
					aa[k + 1] = aa[k + 1] - 1;
				}
			}
			for (int l = aline;l >= 1; l--)
			{
				if (aa[l] == 0 && l == aline)
				{
					continue;
				}
				System.out.print(aa[l]);
			}
			if (m != n)
			{
				System.out.print("\n");
			}
		}
		System.in.read();
		return 0;
	}
}

