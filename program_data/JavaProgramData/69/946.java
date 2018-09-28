package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String x = new String(new char[1000]);
		String y = new String(new char[1000]);
		x = ConsoleInput.readToWhiteSpace(true).charAt(0);
		y = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len1 = x.length();
		int len2 = y.length();
		if (len1 == 1 && len2 == 1)
		{
			System.out.print(0);
		}
		int[] sum = new int[1000];
		for (i = 0; i < 1000; i++)
		{
			sum[i] = 0;
		}
		for (i = len1 - 1, j = len2 - 1; i >= 0 && j >= 0; i--, j--)
		{
			int k = x.charAt(i) + y.charAt(j) - 2 * '0';
			sum[len1 - i - 1] += k;
		}
		if (len1 > len2)
		{
			for (i = len1 - len2 - 1; i >= 0; i--)
			{
				sum[len1 - i - 1] += x.charAt(i) - '0';
			}
		}
		else if (len1 < len2)
		{
			for (i = len2 - len1 - 1; i >= 0; i--)
			{
				sum[len2 - i - 1] += y.charAt(i) - '0';
			}
		}
		for (i = 0; i < 999; i++)
		{
			if (sum[i] > 9)
			{
				sum[i + 1] += sum[i] / 10;
				sum[i] = sum[i] % 10;
			}
		}
		i = 999;
		while (sum[i] == 0)
		{
			i--;
		}
		for (j = i; j >= 0; j--)
		{
			System.out.print(sum[j]);
		}
		System.out.print("\n");
		return 0;
	}
}

