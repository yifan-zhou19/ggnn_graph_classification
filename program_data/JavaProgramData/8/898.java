package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void take(int x[1000],int l);
		void rank(int x[1000],int l);
		void com(int a[1000],int b[1000],int c[2000],int al,int bl);
		void prin(int c[2000],int l);
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[2000];
		int al;
		int bl;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			al = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			bl = Integer.parseInt(tempVar2);
		}
		take(a, al);
		take(b, bl);
		rank(a, al);
		rank(b, bl);
		com(a, b, c, al, bl);
		prin(c, al + bl);
		return 0;
	}
	public static void take(int[] x, int l)
	{
		int i;
		for (i = 0;i < l;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[i] = Integer.parseInt(tempVar);
			}
		}
	}
	public static void rank(int[] x, int l)
	{
		int i;
		int j;
		int temp;
		if (l != 1)
		{
		for (i = l - 2;i >= 0;i--)
		{
			for (j = 0;j <= i;j++)
			{
				if (x[j] > x[j + 1])
				{
					temp = x[j];
					x[j] = x[j + 1];
					x[j + 1] = temp;
				}
			}
		}
		}
	}
	public static void com(int[] a, int[] b, int[] c, int al, int bl)
	{
		int i;
		for (i = 0;i < al;i++)
		{
			c[i] = a[i];
		}
		for (i = al;i < al + bl;i++)
		{
			c[i] = b[i - al];
		}
	}
	public static void prin(int[] c, int l)
	{
		int i;
		System.out.printf("%d",c[0]);
		for (i = 1;i < l;i++)
		{
			System.out.printf(" %d",c[i]);
		}
	}
}

