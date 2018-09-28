package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100]; //???????????????????
	public static int[] b = new int[100];
	public static int p;
	public static int q;
	public static void input() //?????input??????????????????
	{
		p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		for (i = 0;i < p;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < q;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void paixu(int[] a, int[] b) //?????paixu??????????????????????
	{
		int i = 0;
		int j = 0;
		int c;
		for (i = 1;i <= p - 1;i++)
		{
			for (j = 0;j < p - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					c = a[j];
					a[j] = a[j + 1];
					a[j + 1] = c;
				}
			}
		}
		for (i = 1;i <= q - 1;i++)
		{
			for (j = 0;j < q - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					c = b[j];
					b[j] = b[j + 1];
					b[j + 1] = c;
				}
			}
		}
	}
	public static void connect(int[] a, int[] b) //????connect????????????????????????
	{
		for (int i = 0;i < q;i++)
		{
			a[p + i] = b[i];
		}
	}
	public static void output(int[] a) //??????????????
	{
		int i = 0;
		System.out.print(a[0]);
		for (i = 1;i < p + q;i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
	}
	public static int Main() //?????
	{
		input();
		paixu(a, b);
		connect(a, b);
		output(a);
		return 0;
	}
}

