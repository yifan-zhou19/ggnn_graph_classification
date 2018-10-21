package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[25];
	public static int Main()
	{
		int max = new int(int k,int n);
		int i;
		int n;
		int m = 0;
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
		for (i = 0;i < n;i++)
		{
			if (max(i, n) > m)
			{
			m = max(i, n);
			}
		}
		System.out.printf("%d",m);
	}
	public static int max(int k,int n)
	{
		int l = 0;
		int j;
		if (k == n - 1)
		{
		l = 0;
		}
		for (j = k + 1;j < n;j++)
		{
			if (a[j] <= a[k])
			{
			   if (max(j, n) > l)
			   {
			   l = max(j, n);
			   }
			}
		}
		return l + 1;
	}



}

