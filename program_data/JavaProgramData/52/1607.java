package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static move(int[] a, int n, int m)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int i;
		int q = 0;
		p = a + n - 1;
		for (; q < m;)
		{
			for (;p > a;p--)
			{
				i = p;
				*p = (p - 1);
				*(p - 1) = i;
			}
			q++;
			p = a + n - 1;
		}
	}
	public static int Main()
	{
		int n;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int[] b = new int[10000];
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
		for (p = b;p < b + n;p++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p = Integer.parseInt(tempVar3);
			}
		}
		move(b, n, m);
		for (p = b;p < b + n - 1;p++)
		{
			System.out.printf("%d ",*p);
		}
		System.out.printf("%d",*p);
	}


}

