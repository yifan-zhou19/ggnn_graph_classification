package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int m;
	public static int n;
	public static void Main()
	{
		int[] a = new int[100];
		int[] b = new int[50];

		void read(int a[],int b[]);
		void rank(int a[],int b[]);
		void link(int a[],int b[]);
		void output(int a[]);

		read(a, b);
		rank(a, b);
		link(a, b);
		output(a);
	}
	public static void read(int[] a, int[] b)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void rank(int[] a, int[] b)
	{
		int t;
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
	}
	public static void link(int[] a, int[] b)
	{
		for (i = 0,j = m;i < n;i++,j++)
		{
			a[j] = b[i];
		}
	}
	public static void output(int[] a)
	{
		for (i = 0;i < m + n;i++)
		{
			System.out.printf("%d",a[i]);
			System.out.printf("%c",(i < m + n - 1)?' ':'\n');
		}
	}
}

