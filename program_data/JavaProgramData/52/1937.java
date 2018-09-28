package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int[] a = new int[100];
		void change(int * p,int n,int m);
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
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		p = a[0];
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		change(tempRef_p, n, m);
		p = tempRef_p.argValue;
		System.out.printf("%d", p);
		for (i = 1;i < n;i++)
		{
		System.out.printf(" %d",*(p + i));
		}
		System.out.print('\n');
	}
	public static void change(tangible.RefObject<Integer> p, int n, int m)
	{
		int i;
		for (i = n - 1;i >= 0;i--)
		{
		*(p.argValue + i + m) = *(p.argValue + i);
		}
		for (i = 0;i < m;i++)
		{
		*(p.argValue + i) = *(p.argValue + i + n);
		}
	}

}

