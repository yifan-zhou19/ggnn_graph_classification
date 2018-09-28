package <missing>;

public class GlobalMembers
{
	public static int num(int[] A1, int N1)
	{
		int i;
		int c = 0;
		for (i = 1;i < N1;i++)
		{
			if (A1[i] != A1[0])
			{
			c = c + 1;
			}
		}
			return c;
	}
	public static void cut(int[] A, int N)
	{
		int[] b = new int[100];
		int i;
		int J = 0;
		for (i = 1;i < N;i++)
		{
			if (A[i] != A[0])
			{
			b[J] = A[i];
			J = J + 1;
			}
		}
		for (i = 0;i < J;i++)
		{
			A[i] = b[i];
		}
	}
	public static void Main()
	{
		int i;
		int n;
		int n0;
		int[] a = new int[100];
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
		}
		System.out.printf("%d",a[0]);
		for (i = 0;;i++)
		{
			n0 = n;
			n = num(a, n);
			cut(a, n0);
			System.out.printf(",%d",a[0]);

			if (num(a, n) == 0)
			{
				break;
			}

		}
	}
}

