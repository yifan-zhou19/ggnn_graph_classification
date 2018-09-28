package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int Main()
	{
		int i;
		int j;
		int k;
		void read(int array1[],int array2[]);
		void sort(int array[],int x);
		void print(int array5[],int array6[]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		read(a, b);
		sort(a, m);
		sort(b, n);
		print(a, b);
	}
	public static void read(int[] array1, int[] array2)
	{
		int i;
		for (i = 0;i < m;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[i] = Integer.parseInt(tempVar2);
		}
		}
	}
	public static void sort(int[] array, int x)
	{
		int i;
		int j;
		int k;
		int t;
		for (i = 0;i < x - 1;i++)
		{
			for (j = i + 1;j < x;j++)
			{
					if (array[j] < array[i])
					{
							t = array[i];
							array[i] = array[j];
							array[j] = t;
					}
			}
		}
	}

	public static void print(int[] array5, int[] array6)
	{
		int j;
		for (j = 0;j < m;j++)
		{
		System.out.printf("%d ",array5[j]);
		}
		for (j = 0;j < n - 1;j++)
		{
		System.out.printf("%d ",array6[j]);
		}
		System.out.printf("%d",array6[n - 1]);
	}

}

