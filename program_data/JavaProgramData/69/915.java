package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		int[] a1 = new int[251];
		int[] b1 = new int[251];
		int[] result = new int[252];
		int n;
		int i;
		int j;
		int k;
		int len1;
		int len2;
		int len;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = a.length();
		len2 = b.length();
		for (i = 0;i < len1;i++)
		{
			a1[len1 - 1 - i] = a.charAt(i) - '0';
		}
		for (i = 0;i < len2;i++)
		{
			b1[len2 - 1 - i] = b.charAt(i) - '0';
		}
		if (len1 > len2)
		{
			len = len1;
		}
		else
		{
			len = len2;
		}
		for (i = 0;i <= len;i++)
		{
			result[i] = 0;
		}
		for (i = 0;i < len;i++)
		{
			if ((i < len1) && (i < len2))
			{
			result[i] += a1[i] + b1[i];
			}
			else if (i >= len1)
			{
				result[i] += b1[i];
			}
			else
			{
				result[i] += a1[i];
			}
			if (result[i] > 9)
			{
				result[i] -= 10;
				result[i + 1] = 1;
			}
		}
		for (i = len;i >= 0;i--)
		{
			if (result[i] != 0)
			{
				len = i + 1;
				break;
			}
		}
		for (i = len - 1;i >= 0;i--)
		{
			System.out.print(result[i]);
		}
		System.out.print("\n");
	return 0;
	}

}

