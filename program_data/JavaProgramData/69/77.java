package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[251]);
		int[] a = new int[251];
		int[] b = new int[251];
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int m = s.length();
		for (int i = s.length();i >= 1;i--)
		{
		a[s.length() - i + 1] = s.charAt(i - 1) - '0';
		}
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (s.length() > m)
		{
		m = s.length();
		}
		for (int i = s.length();i >= 1;i--)
		{
		b[s.length() - i + 1] = s.charAt(i - 1) - '0';
		}
		int i;
		for (i = 1;i <= m + 1;i++)
		{
			a[i + 1] += (a[i] + b[i]) / 10;
			a[i] = (a[i] + b[i]) % 10;
		}
		for (;a[i] == 0 && i > 1;i--)
		{
			;
		}
		for (;i >= 1;i--)
		{
		System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}

}

