package <missing>;

public class GlobalMembers
{
	public static int f(int n,int k)
	{
		int i;
		int[] t = new int[100];
		int p = 1;
		t[0] = n + k;
		for (i = 1;i < n;i++)
		{
						 t[i] = (n * t[i - 1]) / (n - 1) + k;
						 if ((n * t[i - 1]) % (n - 1) != 0)
						 {
													 p++;
													 t[0] = p * n + k;
													 i = 0;
						 }
		}
		return t[n - 1];
	}
	public static int Main()
	{
		int m = new int(int n,int k);
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d\n",f(n, k));

		return 0;
	}

}

