package <missing>;

public class GlobalMembers
{
	public static int input(int n) //???????
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return n;
	}
	public static void paixu(int[] a, int n) //???????
	{
		int i;
		int j;
		int p;
		for (i = 0;i <= n - 2;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] > a[j])
				{
					p = a[i];
					a[i] = a[j];
					a[j] = p;
				}
			}
		}
	}
	public static void add(int[] a, int[] b, int n1, int n2) //???????
	{
		int i;
		for (i = 0;i < n1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		for (i = 0;i < n2 - 1;i++)
		{
			System.out.print(b[i]);
			System.out.print(" ");
		}
		System.out.print(b[n2 - 1]);
		System.out.print("\n");
	}
	public static int Main() //???
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int n1;
		int n2;
		int i;
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n1;i++)
		{
			a[i] = input(a[i]);
		}
		for (i = 0;i < n2;i++)
		{
			b[i] = input(b[i]);
		}
		paixu(a, n1);
		paixu(b, n2);
		add(a, b, n1, n2);
		return 0;
	}

}

