package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int f = new int(int x[],int X,int y[],int Y);
	 void arr(int k[],int K);
		int i;
		int m;
		int n;
		int k;
		int[] a = new int[1000];
		int[] b = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	f(a, m, b, n);
	k = 0;
	 for (i = 0;i < m + n;i++)
	 {
		 System.out.printf("%d",a[i]);
	k++;
	if (k < m + n)
	{
	System.out.print(" ");
	}
	 }
	}
	 public static int f(int[] x, int X, int[] y, int Y)
	 {
	int j;
		arr(x, X);
		arr(y, Y);

		for (j = X;j < X + Y;j++)
		{
			x[j] = y[j - X];
		}

	 }
	 public static void arr(int[] k, int K)
	 {
		 int i;
		 int j;
		 int t;
		 int d;
		 for (i = 0;i < K - 1;i++)
		 {
			 d = i;
			 for (j = i + 1;j < K;j++)
			 {
				 if (k[j] < k[d])
				 {
					 d = j;
				 }
			 }
				 t = k[d];
				 k[d] = k[i];
				 k[i] = t;
		 }
	 }



}

