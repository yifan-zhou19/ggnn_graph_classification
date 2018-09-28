package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int zj;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		int[] a = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = a;p < a + n;p++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = Integer.parseInt(tempVar2);
		}
		}
		m = (n - 1) / 2;
		for (p = a,q = a + n - 1;p < a + m + 1;p++,q--)
		{
			zj = p;
			*p = q;
			*q = zj;
		}
		for (p = a;p < a + n - 1;p++)
		{
		System.out.printf("%d ",*p);
		}
		System.out.printf("%d",a[n - 1]);



	}
}

