package <missing>;

public class GlobalMembers
{
	public static void f(int[] h, int[] a, int i)
	{
		int t;
		int j;
		for (j = 0,t = 0;j < i;j++)
		{
				if (h[j] >= h[i] != 0 && a[j] > t)
				{
					t = a[j];
				}
		}
		 a[i] = t + 1;
	}
	public static void Main()
	{
		int[] a = new int[25];
		int k;
		int[] h = new int[25];
		int t;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < k;i++)
		{
			f(h, a, i);
		}
		for (i = 0,t = 0;i < k;i++)
		{
			if (a[i] > t)
			{
				t = a[i];
			}
		}
		System.out.printf("%d\n",t);
	}
}

