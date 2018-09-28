package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int[] c = new int[2000];
	public static int p;
	public static int q;

	public static void read()
	{ //???????????????????
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

	public static void increaseSort()
	{ //???????????
		sort(a + 0,a + p);
		sort(b + 0,b + q);
	}

	public static void merge()
	{ // ??????????
		int i = 0;
		for (i = 0;i < p;i++)
		{
			c[i] = a[i];
		}
		for (i = p;i < p + q;i++)
		{
			c[i] = b[i - p];
		}
	}

	public static void print()
	{ //?????????
		int i = 0;
		System.out.print(c[0]);
		for (i = 1;i < p + q;i++)
		{
			System.out.print(" ");
			System.out.print(c[i]);
		}
		System.out.print("\n");
	}

	public static int Main()
	{
		read();
		increaseSort();
		merge();
		print();
		return 0;
	}

}

