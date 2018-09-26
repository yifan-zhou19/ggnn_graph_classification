package <missing>;

public class GlobalMembers
{
	//??????
	public static int[] a = new int[1001];
	public static int[] b = new int[1001];
	public static int Main()
	{
		int i = 0;
		String str = new String(new char[100001]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l = str.length();
		int j1 = 0;
		int j2 = 0;
		while (j1 < l)
		{
			if (str.charAt(j1) >= '0' && str.charAt(j1) <= '9')
			{
				i++;
				for (j2 = j1; str.charAt(j2) >= '0' && str.charAt(j2) <= '9'; j2++)
				{
					a[i] = 10 * a[i] + str.charAt(j2) - '0';
				}
				j1 = j2;
			}
			else
			{
				j1++;
			}
		}
		int n = i;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = str.length(), j1 = 0, j2 = 0, i = 0;
		while (j1 < l)
		{
			if (str.charAt(j1) >= '0' && str.charAt(j1) <= '9')
			{
				i++;
				for (j2 = j1; str.charAt(j2) >= '0' && str.charAt(j2) <= '9'; j2++)
				{
					b[i] = 10 * b[i] + str.charAt(j2) - '0';
				}
				j1 = j2;
			}
			else
			{
				j1++;
			}
		}
		int k = 0;
		int max = 0;
		for (k = 0; k <= 1000; k++)
		{
			int sum = 0;
			for (i = 1; i <= n; i++)
			{
				if (k >= a[i] != 0 && k < b[i])
				{
					sum++;
				}
			}
			if (sum > max)
			{
				max = sum;
			}
		}
		System.out.print(n);
		System.out.print(' ');
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

