package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int n;
	public static int m;
	public static int Main()
	{
		int i;
		void move(int n,int m,int a[50]);
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
		move(n, m, a);
		for (i = 0;i < n - 1;i++)
		{
		System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d\n",a[n - 1]);
	}
	public static void move(int n, int m, int[] a)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 int * p;
		 int d;
		 for (;m > 0;m--)
		 {
		  d = a[n - 1];
		  for (p = a + n - 1;p > a;p--)
		  {
		  *p = (p - 1);
		  }
		  a[0] = d;
		 }
	}

}

