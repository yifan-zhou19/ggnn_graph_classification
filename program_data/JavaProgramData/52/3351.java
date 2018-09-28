package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=&a[0];
		int p = a[0];
		int i;
		int n;
		int m;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = n - m;i < n;i++)
		{
			System.out.printf("%d ",*(p + i));
		}
		for (i = 0;i < n - m;i++)
		{
			System.out.printf("%d",*(p + i));
			if (i != n - m - 1)
			{
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}

}

