package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		int j;
		int n;
		int m;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
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

		p = a[n - m];
		for (k = n - m;k < n;k++,p++)
		{
			System.out.printf("%d ",*p);
		}
		p = a[0];
		for (j = 0;j < n - m - 1;j++,p++)
		{
			System.out.printf("%d ",*p);
		}
		System.out.printf("%d",a[n - m - 1]);

	}
}

