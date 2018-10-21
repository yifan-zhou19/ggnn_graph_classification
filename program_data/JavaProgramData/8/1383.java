package <missing>;

public class GlobalMembers
{
	public static void input(tangible.RefObject<Integer> M, tangible.RefObject<Integer> N, int[] a, int[] b)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			M.argValue = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			N.argValue = Integer.parseInt(tempVar2);
		}
		int i;
		for (i = 0;i < M.argValue;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < N.argValue;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		//return M,N;                   	
		return;
	}

	public static void sort(int[] array, int n)
	{
		int i;
		int j;
		int k;
		int t;
		for (i = 0;i < n - 1;i++)
		{
			k = i;
			for (j = i + 1;j < n;j++)
			{
				if (array[j] < array[k])
				{
					k = j;
				}
			}
			t = array[k];
			array[k] = array[i];
			array[i] = t;
		}

	}

	public static void merge(int M, int N, int[] a, int[] b, int[] c)
	{
		int i;
		for (i = 0;i < M;i++)
		{
			c[i] = a[i];
		}
		for (i = 0;i < N;i++)
		{
			c[i + M] = b[i];
		}
	}

	public static void output(int M, int N, int[] c)
	{
		int i;
		for (i = 0;i < M + N - 1;i++)
		{
			System.out.printf("%d ",c[i]);
		}
		System.out.printf("%d",c[M + N - 1]);
	}

	public static int Main()
	{
		int M;
		int N;
		int[] a = new int[100000];
		int[] b = new int[100000];
	tangible.RefObject<Integer> tempRef_M = new tangible.RefObject<Integer>(M);
	tangible.RefObject<Integer> tempRef_N = new tangible.RefObject<Integer>(N);
		input(tempRef_M, tempRef_N, a, b);
		N = tempRef_N.argValue;
		M = tempRef_M.argValue;
		sort(a, M);
		sort(b, N);

		int[] c = new int[100000];
		merge(M, N, a, b, c);
		output(M, N, c);

		return 0;
	}
}

