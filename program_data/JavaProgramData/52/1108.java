package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		void move(int *,int,int);
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		p = a;
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		move(tempRef_p, n, m);
		p = tempRef_p.argValue;
		for (i = 0;i < n - 1;i++,p++)
		{
			System.out.printf("%d ",*p);
		}
		System.out.printf("%d\n",*p);
	}

	public static void move(tangible.RefObject<Integer> p, int n, int m)
	{
		int i;
		int t;
		t = (p.argValue + n - 1);
		for (i = n - 1;i > 0;i--)
		{
			*(p.argValue + i) = *(p.argValue + i - 1);
		}
		p.argValue = t;
		m--;
		if (m > 0)
		{
			move(p, n, m);
		}

	}
}

