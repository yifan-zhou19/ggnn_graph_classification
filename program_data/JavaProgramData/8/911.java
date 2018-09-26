package <missing>;

public class GlobalMembers
{
	/*
	 * ???????????????????????? .cpp
	 * Created on: 2012-11-28
	 * Author:???
	 */
	public static int[] a = new int[300];
	public static int[] b = new int[300];
	public static int m;
	public static int n;
	public static int i;
	public static int j;
	public static int t;
	public static int[] c = new int[300];
	public static void f1()
	{ //?????????
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{ //??a??
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{ //??b??
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void f2()
	{ //???????
		for (i = 0;i < m - 1;i++)
		{ //??
			for (j = i + 1;j <= m - 1;j++)
			{
				if (a[i] > a[j])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{ //??
				for (j = i + 1;j <= n - 1;j++)
				{
					if (b[i] > b[j])
					{
						t = b[i];
						b[i] = b[j];
						b[j] = t;
					}
				}
		}
	}
	public static void f3()
	{ //??????????
		for (i = 0;i < m;i++)
		{ //?a?c
			c[i] = a[i];
		}
		for (i = m;i < m + n;i++)
		{ //??b??c?a???
			c[i] = b[i - m];
		}
	}
	public static void f4()
	{ //???????
		System.out.print(c[0]);
		for (i = 1;i < m + n;i++)
		{
			System.out.print(' ');
			System.out.print(c[i]);
		}
	}
	public static int Main()
	{
		f1(); //?????????
		f2(); //???????
		f3(); //??????????
		f4(); //???????
	}

}

