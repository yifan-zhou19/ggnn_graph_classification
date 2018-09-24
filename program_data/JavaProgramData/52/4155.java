package <missing>;

public class GlobalMembers
{
	public static void make(tangible.RefObject<Integer> p1, int n, int m)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p2;
		int[] b = new int[100];
		int i;
		p2 = b;
		for (i = n - m;i < n;i++)
		{
		 *p2++=*(p1.argValue + i);
		}
		for (i = n - m - 1;i >= 0;i--)
		{
		 *(p1.argValue + i + m) = *(p1.argValue + i);
		}
		p2 = b;
		for (i = 0;i < m;i++)
		{
		 *(p1.argValue + i) = *(p2 + i);
		}
	}
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int[] a = new int[100];
		int i;
		int n;
		int m;
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
	tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
		make(tempRef_a, n, m);
		a = tempRef_a.argValue;
		p = a;
		for (i = 0;i < n - 1;i++)
		{
		  System.out.printf("%d ",*p++);
		}
		System.out.printf("%d",*p);
	}

}

