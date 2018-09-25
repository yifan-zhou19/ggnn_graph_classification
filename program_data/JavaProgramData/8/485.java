package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static void change(int[] a, int n)
	{
		int t;
		int i;
		int j;
		for (i = 1;i < n;i++)
		{
		for (j = 0;j < i;j++)
		{
			if (a[i] < a[j])
			{
				t = a[j];
				a[j] = a[i];
				a[i] = t;
			}
		}
		}
	}
	public static void input(int[] a, int n)
	{
		int i;
		for (i = 0;i < n;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = tempVar;
		}
		}
	}
	public static void output(int[] a, int n)
	{
		int i;
		for (i = 0;i < n;i++)
		{
		System.out.printf("%d ",a[i]);
		}
	}
	public static void Main()
	{
		int n;
		int m;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		input(a, n);
		input(b, m);
		change(a, n);
		change(b, m);
		output(a, n);
		output(b, m - 1);
		System.out.printf("%d",b[m - 1]);
	}



}

