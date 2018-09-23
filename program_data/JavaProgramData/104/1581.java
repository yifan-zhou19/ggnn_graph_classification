package <missing>;

public class GlobalMembers
{
	public static int comp(Object c, Object d)
	{
		return *(int)c - (int)d;
	}
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k;
		int x;
		int y;
		int x1;
		int y1;
		int[] a = new int[1001];
		int[] b = new int[1001];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		x1 = x;
		y1 = y;
		while (x >= 1)
		{
			a[i++] = x;
			x /= 2;
		}
		while (y >= 1)
		{
			b[j++] = y;
			y /= 2;
		}
		qsort(a,i,(Integer.SIZE / Byte.SIZE),comp);
		qsort(b,j,(Integer.SIZE / Byte.SIZE),comp);
		for (i = 0;;i++)
		{
			if (a[i] == b[i])
			{
				k = a[i];
			}
			else
			{
				break;
			}
		}
		if (x1 == y1)
		{
			System.out.printf("%d",x1);
		}
		else
		{
			System.out.printf("%d",k);
		}
		return 0;
	}
}

