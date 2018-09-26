package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int e;
		int n;
		int k;
		int i;
		int s;
		int t;
		int f;
		t = (int)Math.abs(num);
		if (num < 0)
		{
			s = -num;
			f = -1;
		}
		else
		{
		s = num;
		f = 1;
		}
		e = (int)Math.log10(t) + 1;
		for (i = 1;i < e / 2 + 1;i++)
		{
			n = (t % (int)Math.pow(10,i)) / (int)Math.pow(10,i - 1);
			k = t / ((int)Math.pow(10,e - i)) - 10 * (t / ((int)Math.pow(10,e - i + 1)));
			s -= n * (int)Math.pow(10,i - 1);
			s -= k * (int)Math.pow(10,e - i);
			s += n * (int)Math.pow(10,e - i);
			s += k * (int)Math.pow(10,i - 1);
		}
		return f * s;
	}

	public static int Main()
	{
		int n;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(reverse(n));
		System.out.print("\n");
	return 0;
	}

}

