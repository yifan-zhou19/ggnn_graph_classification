package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[300];
	public static int[] b = new int[300];
	public static int[] c = new int[600];
	public static void myfunc()
	{
		int la;
		int lb;
		int i;
		la = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		lb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < la;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < lb;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		sort(a,a + la);
		sort(b,b + lb);
		for (i = 0;i < la;i++)
		{
			c[i] = a[i];
		}
		for (i = la;i < la + lb;i++)
		{
			c[i] = b[i - la];
		}
		for (i = 0;i < la + lb - 1;i++)
		{
			System.out.print(c[i]);
			System.out.print(' ');
		}
			 System.out.print(c[i]);
	}
	public static int Main()
	{
		myfunc();
		return 0;
	}



}

