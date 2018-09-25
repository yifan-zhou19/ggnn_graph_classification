package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10000];
	public static int[] b = new int[10000];
	public static int sizea;
	public static int sizeb;
	public static void read()
	{
		sizea = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sizeb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 0;i <= sizea - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i <= sizeb - 1;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void order(int n, int[] a)
	{
		int i;
		int j;
		int temp;
		for (i = n - 1;i >= 1;i--)
		{
			for (j = 0;j <= i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	public static void paixu()
	{
		order(sizea, a);
		order(sizeb, b);
	}
	public static void mix()
	{
		int i;
		for (i = 0;i <= sizeb - 1;i++)
		{
			a[sizea + i] = b[i];
		}
	}
	public static void print()
	{
		System.out.print(a[0]);
		for (int i = 1;i <= sizea + sizeb - 1;i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
	}
	public static int Main()
	{
		read();
		paixu();
		mix();
		print();
	}
}

