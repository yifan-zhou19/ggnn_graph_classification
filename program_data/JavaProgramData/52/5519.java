package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void stand(int a[],int M,int N,int x);
		int[] s = new int[100];
		int n;
		int m;
		int i;
		int z;
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
		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s[i] = Integer.parseInt(tempVar3);
		}
		}
		z = m;
		while (m != 0)
		{
		stand(s, m, n, z);
		m--;
		}
		System.out.printf("%d",s[0]);
		for (i = 1;i < n;i++)
		{
		System.out.printf(" %d",s[i]);
		}
	}
	public static void stand(int[] a, int M, int N, int x)
	{
		int k;
		int t;
		int q;
		for (k = N - M;k > x - M;k--)
		{
		t = a[k];
		a[k] = a[k - 1];
		a[k - 1] = t;
		}
	}

}

