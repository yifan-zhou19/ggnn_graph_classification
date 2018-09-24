package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int n;
		int i;
		int j;
		int k = 0;
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
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
			if ((*(p + i) - *(p + j)) != 0)
			{
				k += 1;
			}
			}
			if (k == i)
			{
				System.out.printf(",%d",*(p + i));
			}
		k = 0;
		}
		return 0;
	}

}

