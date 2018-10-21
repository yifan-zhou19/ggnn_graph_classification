package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int n;
		int m;
		int i;
		int o;
		int k;
		int u;
		int l;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		p = a;
		for (l = 0;l < m;l++)
		{
			b[l] = (p + n - m + l);
		}
		for (o = n - m - 1;o >= 0;o--)
		{
			*(p + o + m) = *(p + o);
		}
		for (k = 0;k < m;k++)
		{
			*(p + k) = b[k];
		}
		System.out.printf("%d",a[0]);
		for (u = 1;u < n;u++)
		{
			System.out.printf(" %d",a[u]);
		}
		return 0;
	}


}

