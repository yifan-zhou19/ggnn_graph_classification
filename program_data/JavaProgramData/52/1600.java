package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
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
		p = b[0];
		for (i = m;i < n;i++)
		{
			*(p + i) = a[i - m];
		}
		p = b[0];
		for (i = 0;i < m;i++)
		{
			*(p + i) = a[n - m + i];
		}
		for (i = 0;i < n - 1;i++)
		{
		System.out.printf("%d ",*(p + i));
		}
		System.out.printf("%d",*(p + n - 1));
	}
}

