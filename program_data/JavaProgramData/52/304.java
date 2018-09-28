package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int Main()
	{
		void f(int * p,int n,int m);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int n;
		int m;
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
		for (p = a;p < a + n;p++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p = Integer.parseInt(tempVar3);
			}
		}
		p = a;
		f(p, n, m);
		for (p = a;p < a + n;p++)
		{
			if (p < a + n - 1)
			{
				System.out.printf("%d ",*p);
			}
			else
			{
				System.out.printf("%d\n",*p);
			}
		}
		return 0;
	}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static void f(int * p, int n, int m)
	{
		int t;
		p += n - 1;
		t = p;
		for (;p > a;p--)
		{
			*p = (p - 1);
		}
		*p = t;
		m -= 1;
		if (m > 0)
		{
			f(p, n, m);
		}
	}

}

