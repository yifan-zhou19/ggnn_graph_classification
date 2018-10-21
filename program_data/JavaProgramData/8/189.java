package <missing>;

public class GlobalMembers
{
	public static void duqu(int n, int m, int[] a, int[] b)
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
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}

	}
	public static void sort(int[] a, int n, int[] b, int m)
	{
		int i;
		int j;
		int t;

		for (j = 0;j < n - 1;j++)
		{

			for (i = 0;i < n - 1 - j;i++)
			{
			if (a[i] > a[i + 1])
			{
				t = a[i];
				a[i] = a[i + 1];
				a[i + 1] = t;
			}
			}
		}
			 for (j = 0;j < m - 1;j++)
			 {

			for (i = 0;i < m - 1 - j;i++)
			{
			if (b[i] > b[i + 1])
			{
				t = b[i];
				b[i] = b[i + 1];
				b[i + 1] = t;
			}
			}
			 }

	}
	public static void hebing(int[] array1, int[] array2, int n, int m)
	{
		int i;
		for (i = n;i < (n + m);i++)
		{
			array1[i] = array2[i - n];
		}

	}
	public static void xian(int[] array, int n, int m)
	{
		int i;
		for (i = 0;i < (n + m - 1);i++)
		{
			System.out.printf("%d ",array[i]);
		}
		System.out.printf("%d",array[n + m - 1]);
	}



	public static void Main()
	{
		void duqu(int n,int m,int a[],int b[]);
		void sort(int * p1,int n,int * p2,int m);
		void hebing(int array1[],int array2[],int n,int m);
		void xian(int array[],int n,int m);
		int n;
		int m;
		int[] a = new int[1000];
		int[] b = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		duqu(n, m, a, b);
		sort(a, n, b, m);
		hebing(a, b, n, m);
		xian(a, n, m);

	}
}

