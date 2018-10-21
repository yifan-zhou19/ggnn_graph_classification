package <missing>;

public class GlobalMembers
{
	public static int Main()
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
		void type(int array[], int n);
		void order(int array[], int q);
		void join(int array1[], int array2[], int q1, int q2);
		void out(int array[], int q1, int q2);
		type(a, n);
		type(b, m);
		order(a, n);
		order(b, m);
		join(a, b, n, m);
		out(a, n, m);
	}

	public static int type(int[] array, int n)
	{
		int c;
		for (c = 0;c < n;c++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				array[c] = Integer.parseInt(tempVar);
			}
		}
	}

	public static int order(int[] array, int q)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < q - 1;i++)
		{
			for (j = 0;j < q - 1;j++)
			{
				if (array[j] >= array[j + 1])
				{
					t = array[j + 1];
					array[j + 1] = array[j];
					array[j] = t;
				}
			}
		}
	}

	public static int join(int[] array1, int[] array2, int q1, int q2)
	{
		int k;
		for (k = 0;k < q2;k++)
		{
			array1[q1 + k] = array2[k];
		}
	}

	public static int out(int[] array, int q1, int q2)
	{
		int k;
		for (k = 0;k < q1 + q2 - 1;k++)
		{
			System.out.printf("%d ",array[k]);
		}
		System.out.printf("%d\n",array[q1 + q2 - 1]);
	}








}

