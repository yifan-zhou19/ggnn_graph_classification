package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[1001];
		int[] b = new int[1001];
		String s1 = new String(new char[1001]);
		String s2 = new String(new char[1001]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		for (i = 0;i < s1.length();i++)
		{
		a[i] = s1.charAt(s1.length() - i - 1) - '0';
		}
		for (i = 0;i < s2.length();i++)
		{
		b[i] = s2.charAt(s2.length() - i - 1) - '0';
		}
		for (i = 0;i <= 999;i++)
		{
			a[i] += b[i];
			a[i + 1] += a[i] / 10;
			a[i] %= 10;
		}
		i = 1000;
		while (i >= 0 && a[i] == 0)
		{
			i--;
		}
		if (i == -1)
		{
		System.out.print("0");
		}
		else
		{
		while (i >= 0)
		{
			System.out.print(a[i]);
			i--;
		}
		}
		return 0;
	}

}
