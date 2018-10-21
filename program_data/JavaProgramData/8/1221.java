package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10000];
	public static int[] b = new int[10000];
	public static int la;
	public static int lb;
	public static int[] c = new int[20000];
//C++ TO JAVA CONVERTER TODO TASK: The following statement was not recognized, possibly due to an unrecognized macro:
	void get();
	public static void array()
	{
		int v;
		for (int i = 0;i < la - 1;i++)
		{
			for (int j = 0;j < la - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					v = a[j];
					a[j] = a[j + 1];
					a[j + 1] = v;
				}
			}
		}
		for (int i = 0;i < lb - 1;i++)
		{
			for (int j = 0;j < lb - i - 1;j++)
			{
				if (b[j] > b[j + 1])
				{
					v = b[j];
					b[j] = b[j + 1];
					b[j + 1] = v;
				}
			}
		}
	}
	public static void combine()
	{
		for (int i = 0;i < la;i++)
		{
			c[i] = a[i];
		}
		for (int i = 0;i < lb;i++)
		{
			c[la + i] = b[i];
		}
	}
	public static void out()
	{
		for (int i = 0;i < la + lb;i++)
		{
			if (i == 0)
			{
			System.out.print(c[i]);
			}
			else
			{
			System.out.print(' ');
			System.out.print(c[i]);
			}
		}
	}
	public static int Main()
	{
		get();
		array();
		combine();
		out();
		return 0;
	}
	public static void get()
	{
		la = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		lb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < la;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < lb;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}

}

