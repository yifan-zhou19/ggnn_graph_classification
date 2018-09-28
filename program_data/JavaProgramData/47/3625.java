package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int n;
		int i;
		int j;
		int m;
		int t;
		p = a;
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
				*(p + i) = tempVar2;
			}
		}
		m = (n) / 2;
		for (i = 0;i < m;i++)
		{
			j = n - i - 1;
			t = (p + i);
			*(p + i) = *(p + j);
			*(p + j) = t;
		}

		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",*(p + i));
		}
		System.out.printf("%d",*(p + n - 1));
	}
}

