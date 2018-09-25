package <missing>;

public class GlobalMembers
{
	public static int duru(int[] a, int l)
	{
		int i;
		int j;
		for (i = 1;i <= l;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return 1;
	}
	public static int paixu(int[] a, int l)
	{
		int i;
		int j;
		int p;
		for (i = 1;i <= l - 1;i++)
		{
			for (j = 1;j <= l - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					p = a[j];
					a[j] = a[j + 1];
					a[j + 1] = p;
				}
			}
		}
		return 1;
	}
	public static int hebing(int[] a, int[] b, int l1, int l2)
	{
		int i;
		for (i = l1 + 1;i <= l1 + l2;i++)
		{
			a[i] = b[i - l1];
		}
		return l1 + l2;
	}
	public static int xianshi(int[] a, int l)
	{
		for (int i = 1;i < l;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[l]);
		System.out.print("\n");
		return 1;
	}
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int l1;
		int l2;
		l1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		duru(a, l1);
		duru(b, l2);
		paixu(a, l1);
		paixu(b, l2);
		l1 = hebing(a, b, l1, l2);
		xianshi(a, l1);
		return 0;
	}
}

