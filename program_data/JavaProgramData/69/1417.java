package <missing>;

public class GlobalMembers
{
	public static int[] an1 = new int[len + 10];
	public static int[] an2 = new int[len + 10];
	public static String szline1 = new String(new char[len + 10]);
	public static String szline2 = new String(new char[len + 10]);
	public static int Add(int maxlen, int[] a1, int[] a2)
	{
		int high = 0;
		for (int i = 0; i < maxlen; i++)
		{
			a1[i] = a1[i] + a2[i];
			if (a1[i] >= 10)
			{
				a1[i] = a1[i] - 10;
				a1[i + 1]++;
			}
		}
		for (int i = maxlen - 1; i >= 0; i--)
		{
			if (a1[i])
			{
				high = i;
				break;
			}
		}
		return high;
	}
	public static int Main()
	{
		szline1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		szline2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int j;
		for (int k = 0; k < len + 10; k++)
		{
			an1[k] = 0;
			an2[k] = 0;
		}
		int len1 = szline1.length();
		int len2 = szline2.length();
		for (j = 0, i = len1 - 1; i >= 0; i--, j++)
		{
			an1[j] = szline1.charAt(i) - '0';
		}
		for (j = 0, i = len2 - 1; i >= 0; i--, j++)
		{
			an2[j] = szline2.charAt(i) - '0';
		}
		int high = Add(len, an1, an2);
		for (i = high; i >= 0; i--)
		{
			System.out.print(an1[i]);
		}
		System.out.print("\n");
	}
}

