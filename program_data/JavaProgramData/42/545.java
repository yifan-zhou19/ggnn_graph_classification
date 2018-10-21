package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100000];
		int n;
		int i;
		int j = 0;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0, p = a[0];i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				*(p + i) = tempVar2;
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			if (*(p + i) != k)
			{
				*(p + j) = *(p + i);
				j++;
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			System.out.printf("%d ",*(p + i));
		}
		System.out.printf("%d\n",*(p + i));
	}
}

