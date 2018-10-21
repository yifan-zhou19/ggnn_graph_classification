package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int a_n;
	public static int b_n;
	public static int i;
	public static void read()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a_n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b_n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < a_n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < b_n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void sort(int[] a, int a_n, int[] b, int b_n)
	{
		int i;
		int j;
		int key;
		for (i = 1;i < a_n;i++)
		{
			key = a[i];
			j = i - 1;
			while (a[j] > key && j >= 0)
			{
				a[j + 1] = a[j];
			j--;
			}
			a[j + 1] = key;
		}
			for (i = 1;i < b_n;i++)
			{
			key = b[i];
			j = i - 1;
			while (b[j] > key && j >= 0)
			{
				b[j + 1] = b[j];
			j--;
			}
			b[j + 1] = key;
			}
	}
	public static void merge(int[] a, int a_n, int[] b, int b_n)
	{
		int i;
		for (i = 0;i < b_n;i++)
		{
			a[a_n + i] = b[i];
		}
	}
	public static void write()
	{
		int i;
		for (i = 0;i < a_n + b_n - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[i]);
	}
	public static void Main()
	{
		read();
		sort(a, a_n, b, b_n);
		merge(a, a_n, b, b_n);
		write();
	}

}

