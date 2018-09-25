package <missing>;

public class GlobalMembers
{
	public static int readin(int n, int[] a)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static int px(int n, int[] a)
	{
		for (i = 1;i < n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (a[i] > a[j])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}
	public static int sc(int n1, int[] a, int n2, int[] b)
	{
		for (int i = 1;i <= n1;i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		for (int i = 1;i <= n2 - 1;i++)
		{
			System.out.print(b[i]);
			System.out.print(' ');
		}
		System.out.print(b[n2]);
	}


	public static int t;
	public static int i;
	public static int j;
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];

	public static int Main()
	{
		int n1;
		int n2;
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		readin(n1, a);
		px(n1, a);
		readin(n2, b);
		px(n2, b);
		sc(n1, a, n2, b);
		return 0;
	}


}

