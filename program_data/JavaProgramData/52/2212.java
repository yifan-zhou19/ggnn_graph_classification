package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int[] a = new int[100];
		int i;
		int m;
		int n;
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
		p = a + m;
		for (i = 0;i < n - m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p++ = Integer.parseInt(tempVar3);
			}
		}
		p = a;
		for (i = 0;i < m;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p++ = Integer.parseInt(tempVar4);
			}
		}
		p = a;
		System.out.print("\n");
		for (i = 0;i < n;i++)
		{
			   if (i != n - 1)
			   {
			System.out.printf("%d ",a[i]);
			   }
			   if (i == n - 1)
			   {
			System.out.printf("%d",a[i]);
			   }
		}
	}
}

