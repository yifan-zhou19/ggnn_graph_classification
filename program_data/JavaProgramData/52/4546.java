package <missing>;

public class GlobalMembers
{
	public static void move(int[] a, int n, int m)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int temp;
		temp = a[n - 1];
		for (p = a + n - 1;p > a;p--)
		{
			*p = (p - 1);
		}
		a[0] = temp;
		m--;
		if (m > 0)
		{
			move(a, n, m);
		}
	}
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[100];
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
		System.in.read();

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		for (p = a;p < (a + n);p++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p = Integer.parseInt(tempVar3);
			}
		}
		move(a, n, m);
		for (p = a;p < (a + n - 1);p++)
		{
			System.out.printf("%d ",*p);
		}
		System.out.printf("%d",*p);
		return 0;
	}
}

