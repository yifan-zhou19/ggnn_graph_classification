package <missing>;

public class GlobalMembers
{
	public static void in(int[] a, int n)
	{
		int i;
			for (i = 0;i < n;i++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			}
	}
	public static void bubblesort(int[] a, int n)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (a[j - 1] > a[j])
				{
					t = a[j];
					a[j] = a[j - 1];
					a[j - 1] = t;
				}
			}
		}

	}

	public static void strc(int[] a, int[] b, int[] c, int n1, int n2)
	{
		int i;
		for (i = 0;i < n1;i++)
		{
			c[i] = a[i];
		}
		for (i = n1;i < n1 + n2;i++)
		{
			c[i] = b[i - n1];
		}
	}
	public static void print(int[] c, int n1, int n2)
	{
		int i;
		for (i = 0;i < n1 + n2 - 1;i++)
		{
			System.out.printf("%d ",c[i]);
		}
		System.out.printf("%d",c[n1 + n2 - 1]);
	}

	public static int Main()
	{
		int i;
		int n1;
		int n2;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		in(a, n1);
		in(b, n2);

		bubblesort(a, n1);
		bubblesort(b, n2);
		strc(a, b, c, n1, n2);
		print(c, n1, n2);



	}

}

