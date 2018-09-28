package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
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
		int[] a = new int[100];
		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		p = a;
		for (i = 1;i < (n - m + 1);i++)
		{
		p++;
		}
		for (i = 0;i < m;i++)
		{
		System.out.printf("%d ",*p);
		p++;
		}
		p = a;
		for (i = 0;i < n - m - 1;i++)
		{
			System.out.printf("%d ",*p);
		p++;
		}
	System.out.printf("%d",*p);
	}


}

