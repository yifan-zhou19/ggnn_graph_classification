package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int n1;
	public static int n2;
	public static int[] a1 = new int[100];
	public static int[] a2 = new int[100];
	public static void scan()
	{
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n1;i++)
		{
			a1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < n2;j++)
		{
			a2[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void adjust()
	{
		int p;
		for (i = 0;i < n1;i++)
		{
			for (j = i + 1;j < n1;j++)
			{
				if (a1[i] > a1[j])
				{
					p = a1[i];
					a1[i] = a1[j];
					a1[j] = p;
				}
			}
		}
		for (i = 0;i < n2;i++)
		{
			for (j = i + 1;j < n2;j++)
			{
				if (a2[i] > a2[j])
				{
					p = a2[i];
					a2[i] = a2[j];
					a2[j] = p;
				}
			}
		}
	}
	public static void combine()
	{
		for (i = n1;i < n1 + n2;i++)
		{
			a1[i] = a2[i - n1];
		}
	}
	public static void print()
	{
		for (i = 0;i < n1 + n2 - 1;i++)
		{
			System.out.print(a1[i]);
			System.out.print(" ");
		}
		System.out.print(a1[n1 + n2 - 1]);
		System.out.print("\n");
	}
	public static int Main()
	{
		scan();
		adjust();
		combine();
		print();
		return 0;
	}
}

