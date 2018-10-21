package <missing>;

public class GlobalMembers
{
	public static int king(int N,int M)
	{
		int[] A = new int[300];
		int[] B = new int[300];
		int m0;
		int i;
		int j;
		for (i = 0;i < N;i++)
		{
			A[i] = i + 1;
		}
		for (i = 1;i < N;i++)
		{
			for (j = 0;j < (N - i);j++)
			{

				m0 = M % (N + 1 - i);
				if (j < N - i + 1 - m0)
				{
					B[j] = A[m0 + j];
				}
				else if (j >= N - i + 1 - m0)
				{
					B[j] = A[j + m0 - N + i - 1];
				}
			}
			for (j = 0;j < (N - i);j++)
			{
				A[j] = B[j];
			}
		}
			return A[0];
	}
	public static void Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int n = 0;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
			n = n + 1;
			if (a[i] == 0 && b[i] == 0)
			{
				break;
			}
		}
		n = n - 1;
		for (i = 0;i < n;i++)
		{
		System.out.printf("%d\n",king(a[i], b[i]));
		}

	}

}

