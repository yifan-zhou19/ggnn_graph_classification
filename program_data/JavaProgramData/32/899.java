package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int y;
		int n;
		int l;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int[] aa = new int[100];
		int[] bb = new int[100];
		int[] c = new int[100];
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= y;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (int r = 0;r < 100;r++)
			{
				aa[r] = 0;
				bb[r] = 0;
				c[r] = 0;
			}
			m = a.length();
			n = b.length();
			for (int i = 0;i < m;i++)
			{
				aa[m - 1 - i] = a.charAt(i) - '0';
			}
			for (int j = 0;j < n;j++)
			{
				bb[n - 1 - j] = b.charAt(j) - '0';
			}
			int carry = 0;
			for (int k = 0;k < m;k++)
			{
				c[k] = carry + aa[k] - bb[k];
				if (c[k] < 0)
				{
					c[k] += 10;
					carry = -1;
				}
				else
				{
					carry = 0;
				}
			}
			for (l = m - 1;l >= 0;l--)
			{
				if (c[l] != 0)
				{
					break;
				}
			}
			if (l == -1)
			{
				System.out.print("0");
				System.out.print("\n");
			}
			else
			{
				for (int x = l;x >= 0;x--)
				{
					System.out.print(c[x]);
				}
				System.out.print("\n");
			}
		}
		return 0;
	}

}

