package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[200];
	public static int n1;
	public static int n2;
	public static int shuru()
	{
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n2;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static int pai()
	{
		int m;
		for (int j = 0;j < n1 - 1;j++)
		{
			for (int i = 0;i < n1 - 1;i++)
			{
				if (a[i] > a[i + 1])
				{
					m = a[i + 1];
					a[i + 1] = a[i];
					a[i] = m;
				}
			}
		}
		for (int j = 0;j < n2 - 1;j++)
		{
			for (int i = 0;i < n2 - 1;i++)
			{
				if (b[i] > b[i + 1])
				{
					m = b[i + 1];
					b[i + 1] = b[i];
					b[i] = m;
				}
			}
		}
	}
	public static int jie()
	{
		for (int i = 0;i < n1;i++)
		{
			c[i] = a[i];
		}
		for (int i = 0;i < n2;i++)
		{
			c[n1 + i] = b[i];
		}
	}
	public static int shuchu()
	{
		System.out.print(c[0]);
		for (int i = 1;i < n1 + n2;i++)
		{
			System.out.print(" ");
			System.out.print(c[i]);
		}
	}
	public static int Main()
	{
		shuru();
		pai();
		jie();
		shuchu();
		return 0;
	}
}

