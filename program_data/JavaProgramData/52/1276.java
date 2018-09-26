package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void move(int a[],int n,int m);
		int[] a = new int[100];
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
		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		move(a, n, m);
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d%c",a[i],(i == n - 1)?'\n':' ');
		}
	}
	public static void move(int[] a, int n, int m)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int t = a[n - 1];
		for (p = a + n - 1;p > a;p--)
		{
		*p = (p - 1);
		}
		a[0] = t;
		m--;
		if (m > 0)
		{
			move(a, n, m);
		}
	}

}

