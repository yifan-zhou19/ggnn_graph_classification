package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int p;
		int q;
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead("\n");
						 if (tempVar2 != null)
						 {
							 a[i] = Integer.parseInt(tempVar2);
						 }
		}
		for (i = 0;i < n;i++)
		{
						 System.out.printf("%d\n",ans(a[i], 2));
		}
		return 0;
	}

	public static int ans(int sum,int min)
	{
		int w;
		int x;
		int u = 1;
		for (w = min;w < sum / 2;w++)
		{
							 x = sum % w;
							 if (x == 0)
							 {
									  if (w <= sum / w)
									  {
									  u += ans(sum / w, w);
									  }
							 }
		}
		return u;
	}
}

