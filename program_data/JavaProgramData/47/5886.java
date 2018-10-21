package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[10000];
		int i;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		p = a[n - 1];
		for (p = a[n - 1];p != a[0];p--)
		{
			System.out.printf("%d ",*p);
		}
		System.out.printf("%d",a[0]);
	}

}

