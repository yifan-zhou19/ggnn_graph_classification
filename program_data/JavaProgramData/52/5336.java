package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] Z = new int[100];
		int n;
		int m;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		p = Z;
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
				Z[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d ",*(p + n - m + i));
		}
		for (i = 0;i < n - m;i++)
		{
			System.out.printf("%d",*(p + i));
			if (i < n - m - 1)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}

}

