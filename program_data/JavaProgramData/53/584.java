package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
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
		p = a;
		System.out.printf("%d", p);
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (*(p + i) == *(p + j))
				{
					*(p + i) = -32000;
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			if (*(p + i) > -32000)
			{
				System.out.printf(",%d",*(p + i));
			}
		}
	}

}

