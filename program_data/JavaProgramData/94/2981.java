package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int index;
		int temp;
		int js = 0;
		int js1 = 0;
		int i;
		int j;
		int k;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		for (k = 0;k <= n - 2;k++)
		{
			index = k;
			for (p = k + 1;p < n;p++)
			{
				if (a[p] < a[index])
				{
					index = p;
				}
			}
			temp = a[k],a[k] = a[index],a[index] = temp;
		}
		for (q = 0;q < n;q++)
		{
			if (a[q] % 2 != 0)
			{
				js = js + 1;
			}
		}
		for (j = 0;j < n;j++)
		{
			if (a[j] % 2 != 0 && js1 < js)
			{
				js1++;
				if (js1 != js)
				{
				System.out.printf("%d,",a[j]);
				}
				if (js1 == js)
				{
				System.out.printf("%d",a[j]);
				}
			}
		}
		return 0;
	}


}

