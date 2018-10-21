package <missing>;

public class GlobalMembers
{
	public static int s1;
	public static int s2;
	public static int reads()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return a;
	}
	public static void reada(int[] a)
	{
		for (int i = 1;i <= s1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void readb(int[] b)
	{
		for (int i = 1;i <= s2;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void reordera(int[] a)
	{
		for (int i = 1;i <= s1 - 1;i++)
		{
			for (int j = 1;j <= s1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					int m = a[j];
					a[j] = a[j + 1];
					a[j + 1] = m;
				}
			}
		}
	}
	public static void reorderb(int[] b)
	{
		for (int i = 1;i <= s2 - 1;i++)
		{
			for (int j = 1;j <= s2 - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					int m = b[j];
					b[j] = b[j + 1];
					b[j + 1] = m;
				}
			}
		}
	}
	public static void hebing(int[] a, int[] b, int[] c)
	{
		for (int i = 1;i <= s1;i++)
		{
			c[i] = a[i];
		}
		for (int i = s1 + 1;i <= s1 + s2;i++)
		{
			c[i] = b[i - s1];
		}
	}
	public static void output(int[] c)
	{
		for (int i = 1;i <= s1 + s2 - 1;i++)
		{
			System.out.print(c[i]);
			System.out.print(" ");
		}
		System.out.print(c[s1 + s2]);
	}

	public static int Main()
	{
		int[] a = new int[500];
		int[] b = new int[500];
		int[] c = new int[1000];
		s1 = reads(); //???????????
		s2 = reads();
		reada(a); //???????
		readb(b); //???????
		reordera(a); //??????????
		reorderb(b); //??????????
		hebing(a, b, c); //??????
		output(c); //????????
		return 0;
	}
}

