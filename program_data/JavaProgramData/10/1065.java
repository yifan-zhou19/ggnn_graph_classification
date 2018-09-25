package <missing>;

public class GlobalMembers
{
	public static int pfC(Object x, Object y)
	{
		int t;
		t = (int)x - (int)y;
		return -t;
	}
	public static int Main()
	{
		int n;
		int t;
		int i;
		int j;
		int[] a = new int[25];
		int[] b = new int[25];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		//int*a=(int*)malloc(n*sizeof(int));
		//int*b=(int*)malloc(n*sizeof(int));

		for (int k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[k] = Integer.parseInt(tempVar2);
			}
			b[k] = 0;
		}
		b[n - 1] = 1;
		for (i = n - 2;i >= 0;i--)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] >= a[j])
				{
					if (b[i] < b[j])
					{
						b[i] = b[j];
					}
				}
			}
			b[i]++;
		}
		qsort(b,n,(Integer.SIZE / Byte.SIZE),pfC);
		System.out.printf("%d",b[0]);
	}

}

