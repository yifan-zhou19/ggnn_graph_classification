package <missing>;

public class GlobalMembers
{
	public static int judge(int a)
	{
		if (a / 10 == 7 || a == 7 || a == 17 || a == 27 || a == 37 || a == 47 || a == 57 || a == 67 || a == 77 || a == 87 || a == 97 || a % 7 == 0)
		{
			return 0;
		}
		else
		{
			return a;
		}
	}
	public static int Main()
	{
		int n;
		int k = 1;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k <= n)
		{
			s = s + judge(k) * judge(k);
			k++;
		}
		System.out.print(s);
		return 0;
	}
}

