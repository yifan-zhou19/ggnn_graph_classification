package <missing>;

public class GlobalMembers
{
	public static void error(tangible.RefObject<Integer> p, tangible.RefObject<Integer> q, int m, int n)
	{
		int i;
		for (i = 0;i < m;i++)
		{
			*(q.argValue + i) = *(p.argValue + n - m + i);
		}
		for (i = 0;i < n - m;i++)
		{
			*(q.argValue + m + i) = *(p.argValue + i);
		}
	}
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int m;
		int n;
		int i;
		p = a;
		q = b;
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
				p + i = Integer.parseInt(tempVar3);
			}
		}
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
	tangible.RefObject<Integer> tempRef_q = new tangible.RefObject<Integer>(q);
		error(tempRef_p, tempRef_q, m, n);
		q = tempRef_q.argValue;
		p = tempRef_p.argValue;
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",b[i]);
		}
		System.out.printf("%d\n",b[n - 1]);
	}


}

