package <missing>;

public class GlobalMembers
{
	public static int turntonum(char c)
	{
		if (c >= '0' && c <= '9')
		{
			return (c - '0');
		}
		if (c >= 'a' && c <= 'z')
		{
			return (c - 'a' + 10);
		}
		if (c >= 'A' && c <= 'Z')
		{
			return (c - 'A' + 10);
		}
	}
	public static int Main()
	{
		int a;
		int b;
		int l;
		String c = new String(new char[100]);
		long num;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		cin.getline(c,80,' ');
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = c.length();
		num = turntonum(c.charAt(0));
		for (int i = 1;i < l;i++)
		{
			int f;
			num = num * a + turntonum(c.charAt(i));
		}
		if (num == 0)
		{
			System.out.print("0");
			return 0;
		}
		int[] d = new int[100];
		int l_;
		l_ = Math.log(num) / Math.log(b) + 1;
		for (int i = l_ - 1;i >= 0;i--)
		{
			d[i] = num % b;
			num = num / b;
		}
		for (int i = 0;i < l_;i++)
		{
			if (d[i] < 10)
			{
				System.out.print(d[i]);
			}
			else
			{
				System.out.print('A' + d[i] - 10);
			}
		}
		return 0;
	}

}

