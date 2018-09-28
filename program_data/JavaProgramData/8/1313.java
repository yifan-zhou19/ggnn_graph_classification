package <missing>;

public class GlobalMembers
{
	public static int Compare(Object elem1, Object elem2)
	{
		return *((int)(elem1)) - (int)(elem2);
	}
	public static int Main()
	{
		int M;
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			M = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			N = Integer.parseInt(tempVar2);
		}
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		for (i = 0;i < M;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		qsort(a,M,(Integer.SIZE / Byte.SIZE),Compare);
		for (i = 0;i < M;i++)
		{
			System.out.print("");
		}
		for (i = 0;i < N;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		qsort(b,N,(Integer.SIZE / Byte.SIZE),Compare);
		for (i = 0;i < N;i++)
		{
			System.out.print("");
		}
		int[] c = new int[200];
		for (i = 0;i < M;i++)
		{
			c[i] = a[i];
		}
		int j;
		for (j = 0;j < N;j++,i++)
		{
			c[i] = b[j];
		}
		for (i = 0;i < M + N - 1;i++)
		{
			System.out.printf("%d ",c[i]);
		}
		System.out.printf("%d",c[i]);
	}

}

