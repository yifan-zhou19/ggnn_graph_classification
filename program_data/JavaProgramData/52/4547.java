package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void f(int * p,int n,int m);
		int[] a = new int[50];
		int n;
		int m;
		int i;
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
		for (i = 1;i <= n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
	tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
		f(tempRef_a, n, m);
		a = tempRef_a.argValue;
		for (i = 1;i < n;i++)
		{
		System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d\n",a[n]);
	}

	public static void f(tangible.RefObject<Integer> p, int n, int m)
	{
		int i;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		for (i = 1;i <= m;i++)
		{
		   t = (p.argValue + n);
		   for (q = p.argValue + n;q > p.argValue+1;q--)
		   {
		   *q = (q - 1);
		   }
		   *q = t;
		}
	}

}

