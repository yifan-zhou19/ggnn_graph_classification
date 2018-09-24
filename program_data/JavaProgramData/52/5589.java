package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[100];
		int c;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * b;
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
		b = a + m;
		for (i = 0;i < m;i++)
		{
			c = a[n - 1];
			b = a[n - 1];
			for (j = n - 1;j > 0;j--)
			{
				*b = (b - 1);
				b = b - 1;
			}
			a[0] = c;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n - 1]);

	}
}

