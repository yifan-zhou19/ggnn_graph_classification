package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double d;
		int[] e = new int[1000];
		String c = new String(new char[1000]);
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		d = c.length();
		for (int i = 0;i < d;i++)
		{
			if (c.charAt(i) >= '0' && c.charAt(i) <= '9')
			{
				e[i] = c.charAt(i) - 48;
			}
			else if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
			{
				e[i] = c.charAt(i) - 55;
			}
			else if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
			{
				e[i] = c.charAt(i) - 87;
			}
		}
		long num = 0;
		for (int i = 0;i < d;i++)
		{
			num = num + e[i] * Math.pow(a,(d - i - 1));
		}
		long[] k = new long[1000];
		long sum;
		sum = num;
		int t = -1;
		int m;
		m = b / 1;
		for (int i = 0;i < 1000;i++)
		{
			k[i] = sum % m;
			sum = sum / m;
			t = t + 1;
			if (sum < 1)
			{
				break;
			}
		}
		String l = new String(new char[1000]);
		for (int i = 0;i <= t;i++)
		{
			if (k[t - i] >= 0 && k[t - i] <= 9)
			{
				l = tangible.StringFunctions.changeCharacter(l, i, k[t - i] + 48);
			}
			else if (k[t - i] >= 10 && k[t - i] <= 35)
			{
				l = tangible.StringFunctions.changeCharacter(l, i, k[t - i] + 55);
			}
		}
		for (int i = 0;i <= t;i++)
		{
			System.out.print(l.charAt(i));
		}
		System.out.print("\n");

		return 0;
	}
}

