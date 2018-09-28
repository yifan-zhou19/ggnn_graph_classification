package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int i;
		int[] a = new int[100];
		int n;
		int m;
		p = a;
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
				p++ = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0,p = a + n - m;i < m;i++,p++)
		{
			System.out.printf("%d ",*p);
		}
		for (i = 0,p = a;i < n - m - 1;i++,p++)
		{
			System.out.printf("%d ",*p);
		}
		System.out.printf("%d",*p);
	}
}

