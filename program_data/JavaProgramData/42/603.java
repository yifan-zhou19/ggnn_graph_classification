package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		p = a;
		int i;
		int m;
		int k;
		int n;
		int l = 0;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == k)
			{
				for (m = i;m < n;m++)
				{
					*(p + m) = *(p + m + 1);
				}
				l = l + 1;
				i = i - 1;
			}
		}
		for (i = 0;i < n - l;i++)
		{
			if (i < n - (l + 1))
			{
				System.out.printf("%d ",a[i]);
			}
		else
		{
			System.out.printf("%d",a[i]);
		}
		}
		return 0;
	}
}

