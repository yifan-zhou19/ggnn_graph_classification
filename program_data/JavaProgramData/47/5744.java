package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int temp;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a + i = tempVar2;
		}
		}
		m = (n - 1) / 2;
		j = a;
		k = a + n - 1;
		p = a + m;
		for (;j <= p;j++,k--)
		{
			temp = j;
		*j = k;
		*k = temp;
		}
		for (i = 0;i < n - 1;i++)
		{
		System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n - 1]);
	}
}

