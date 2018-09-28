package <missing>;

public class GlobalMembers
{
	public static void inv(tangible.RefObject<Integer> x, int n)
	{
		 int temp;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		 int p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 int * i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 int * j;
		 int m = (n - 1) / 2;
		 i = x.argValue;
		 j = x.argValue + n - 1;
		 p = x.argValue + m;
		 for (;i <= p;i++,j--)
		 {
						 temp = i;
						 *i = j;
						 *j = temp;
		 }
						 return;
	}
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = a;
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p++ = Integer.parseInt(tempVar2);
		}
		}
	tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
		inv(tempRef_a, n);
		a = tempRef_a.argValue;
		for (i = 0;i < n - 1;i++)
		{
		System.out.printf("%d ",a[i]);
		}

		System.out.printf("%d",a[n - 1]);
		 return 0;
	}
}

