package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[300];
	public static int aw;
	public static int[] b = new int[300];
	public static int bw;
	public static int[] c = new int[300];
	public static int cw;
	public static int Main()
	{
		String tp = new String(new char[300]);
		tp = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 1;i <= tp.length();i++)
		{
			a[i] = tp.charAt(tp.length() - i) - 48;

		}
		aw = tp.length();
		tp = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 1;i <= tp.length();i++)
		{
			b[i] = tp.charAt(tp.length() - i) - 48;
		}
		bw = tp.length();

		int max = aw > bw != 0?aw:bw;
		c[1] = 0;
		for (int i = 1;i <= max;i++)
		{
			c[i + 1] = 0;
			c[i] = c[i] + a[i] + b[i];
			c[i + 1] = c[i] / 10;
			c[i] = c[i] % 10;
		}
		cw = 1;
		for (int i = max + 5;i >= 1;i--)
		{
			if (c[i] != 0)
			{
				cw = i;
				break;
			}
		}
		for (int i = 0;i < cw;i++)
		{
			System.out.print(c[cw - i]);
		}
	}
}

