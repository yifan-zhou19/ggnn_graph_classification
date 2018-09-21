package <missing>;

public class GlobalMembers
{
	public static char[] s = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};

	public static void cal()
	{
		int len = s.length();
		int[] num = new int[100];
		for (int i = 0; i < len; i++)
		{
			num[i] = s[i] - '0';
		}
		for (int i = 0; i < len; i++)
		{
			num[i] *= 2;
		}
		for (int i = 0; i < len; i++)
		{
			if (num[i] > 9)
			{
				num[i + 1] += num[i] / 10;
				num[i] %= 10;
			}
		}
		if (num[len] == 0)
		{
			for (int i = 0; i < len; i++)
			{
				s[i] = (char)(num[i] + '0');
			}
		}
		else
		{
			for (int i = 0; i <= len; i++)
			{
				s[i] = (char)(num[i] + '0');
			}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s[0] = '1';
		for (int i = 0; i < n; i++)
		{
			cal();
		}
		int l = s.length();
		for (int i = l - 1; i >= 0; i--)
		{
			System.out.print(s[i]);
		}
		System.out.print("\n");

		return 0;
	}
}

