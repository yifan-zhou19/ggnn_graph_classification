package <missing>;

public class GlobalMembers
{
	/* Name      : ????? 
	 * Version   : 1.0
	 * Date      : 2012-11-18
	 * New       : Null
	 * Func&Feat : 
	 * State     : Design
	 */
	public static void readin(int ma, int mb, int[] a, int[] b)
	{
		for (int i = 0;i < ma;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < mb;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void rearange(int ma, int mb, int[] a, int[] b)
	{
		int temp;
		for (int i = 0;i < ma;i++)
		{
			for (int j = 0;j < ma - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					int temp;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0;i < mb;i++)
		{
			for (int j = 0;j < mb - 1;j++)
			{
				if (b[j] > b[j + 1])
				{
					int temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
	}
	public static int printout(int ma, int mb, int[] a, int[] b)
	{
		for (int i = 0;i < ma;i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		for (int i = 0;i < mb - 1;i++)
		{
			System.out.print(b[i]);
			System.out.print(' ');
		}
		System.out.print(b[mb - 1]);
	}
	public static int Main()
	{
		int[] ma = new int[1];
		int[] mb = new int[1];
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		readin(1, 1, ma, mb);
		readin(ma[0], mb[0], a, b);
		rearange(ma[0], mb[0], a, b);
		printout(ma[0], mb[0], a, b);
		return 0;
	}

}

