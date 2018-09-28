package <missing>;

public class GlobalMembers
{
	public static int fpg(int M,int N)
	{
		int i;
		int K = 1;
		if (N == 1)
		{
			return K = 1;
		}
		if (M < N)
		{
			K = fpg(M, N - 1);
		}
		else
		{
			K = fpg(M, N - 1) + fpg(M - N, N);
		}
		return K;
	}
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			c[i] = fpg(a[i], b[i]);
			System.out.printf("%d\n",c[i]);
		}
		return 0;
	}

}

