package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p2', so pointers on this parameter are left unchanged:
	public static void f(tangible.RefObject<Integer> p1, int * p2, int m, int n)
	{
		do
		{
			System.out.printf("%d\n",*p2);
			p2 += n - 1;
		} while ((p2 - p1.argValue+1) % n && (p2 - p1.argValue+1) <= m * n);
	}

	public static void Main(String[] args)
	{
		int r;
		int l;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[l+r-1];
		int[] p = new int[l + r - 1];
		int[][] a = new int[r][l];
		for (i = 1;i <= r;i++)
		{
		for (j = 1;j <= l;j++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i - 1][j - 1] = Integer.parseInt(tempVar3);
		}
		}
		}
		for (i = 1;i <= l;i++)
		{
		p[i - 1] = a[0][i - 1];
		}
		for (i = l + 1;i <= l + r - 1;i++)
		{
		p[i - 1] = a[i - l][l - 1];
		}
		q = a[0][0];
		for (i = 1;i <= r + l - 1;i++)
		{
	tangible.RefObject<Integer> tempRef_q = new tangible.RefObject<Integer>(q);
		f(tempRef_q, p[i - 1], r, l);
		q = tempRef_q.argValue;
		}

	}

}

