package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[251]);
	public static String b = new String(new char[251]);
	public static int[] c = new int[250];
	public static int[] d = new int[250];
	public static int[] e = new int[251];
	public static int maxLen = 0;
	public static void f(tangible.RefObject<String> str, int[] num)
	{
		int len = str.argValue.length();
		int i;
		int j;
		for (i = 0; i < len; i++)
		{
			if (a.charAt(i) != '0')
			{
				break;
			}
		}
		if (len - i > maxLen)
		{
			maxLen = len - i;
		}
		for (j = len - 1; j >= i; j--)
		{
			num[len - 1 - j] = str.argValue.charAt(j) - '0';
		}
	}
	public static int Main()
	{
		int i;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		f(tempRef_a, c);
		a = tempRef_a.argValue;
	tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
		f(tempRef_b, d);
		b = tempRef_b.argValue;
		int n = maxLen;
		for (i = 0; i < n; i++)
		{
			int jinwei = (e[i] + c[i] + d[i]) / 10;
			e[i] = (e[i] + c[i] + d[i]) % 10;
			e[i + 1] += jinwei;
		}
		if (e[n] != 0)
		{
			n++;
		}
		if (n == 0)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		for (i = n - 1; i >= 0; i--)
		{
			if (e[i] != 0)
			{
				break;
			}
		}
		for (int j = i; j >= 0; j--)
		{
			System.out.print(e[j]);
		}
		System.out.print("\n");
		return 0;
	}

}

