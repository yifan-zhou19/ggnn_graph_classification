package <missing>;

public class GlobalMembers
{
	public static int[] num = new int[2];
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[100];
	public static void getarray(int[] a, int[] b, int[] num)
	{
		num[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < num[0] ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0 ;i < num[1] ; i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void sort(int[] a, int[] b, int af, int bf)
	{
		int temp;
		for (int i = 0 ; i < af - 1; i++)
		{
			for (int j = 1 ; j < af - i ; j++)
			{
				if (a[j] < a[j - 1])
				{
					temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}
		for (int i = 0 ; i < bf - 1; i++)
		{
			for (int j = 1 ; j < bf - i ; j++)
			{
				if (b[j] < b[j - 1])
				{
					temp = b[j];
					b[j] = b[j - 1];
					b[j - 1] = temp;
				}
			}
		}
	}
	public static void combine(int[] a, int[] b, int[] c, int af, int bf)
	{
		for (int i = 0 ; i < af ; i++)
		{
			c[i] = a[i];
		}
		for (int i = af; i < af + bf ;i++)
		{
			c[i] = b[i - af];
		}
	}
	public static void print(int[] c, int af, int bf)
	{
		System.out.print(c[0]);
		for (int i = 1 ; i < af + bf ; i++)
		{
			System.out.print(' ');
			System.out.print(c[i]);
		}
	}
	public static int Main()
	{
		getarray(a, b, num);
		sort(a, b, num[0], num[1]);
		combine(a, b, c, num[0], num[1]);
		print(c, num[0], num[1]);
	}
}

