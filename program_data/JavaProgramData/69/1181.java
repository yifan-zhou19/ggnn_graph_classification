package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[250]);
	public static String b = new String(new char[250]);
	public static int daoxu(tangible.RefObject<String> s, int[] x)
	{
		int len;
		int i;
		len = s.argValue.length();
		for (i = 0;i < len;i++)
		{
			x[len - i - 1] = s.argValue.charAt(i) - 48;
		}
		for (i = len;i < 250;i++)
		{
			x[i] = 0;
		}
		return len;
	}
	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int[] c = new int[250];
		int[] d = new int[250];
		int m;
		int n;
		int k;
		int i;
	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		m = daoxu(tempRef_a, c);
		a = tempRef_a.argValue;
	tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
		n = daoxu(tempRef_b, d);
		b = tempRef_b.argValue;
		for (i = 0;i < 250;i++)
		{
			c[i] += d[i];
			if (c[i] > 9)
			{
				c[i + 1]++;
				c[i] -= 10;
			}
		}
		if (m == 1 && n == 1 && c[0] + d[0] == 0)
		{
			System.out.print("0");
		}
		else
		{
			for (i = 249;;i--)
			{
				if (c[i] != 0)
				{
					k = i;
					break;
				}
			}
			for (i = k;i >= 0;i--)
			{
				System.out.print(c[i]);
			}
		}
	}
}

