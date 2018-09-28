package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int j = 0;
		int m = 1;
		int k;
		int[] a = new int[100];
		int[] b = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1,*p2;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		p2 = b;
		p1 = a;
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
		p2 = p1;
		for (i = 1;i < n;i++)
		{
			j = 0;
			for (k = 0;k < i;k++)
			{
				if (*(p1 + i) != *(p1 + k))
				{
					j++;
				}
			}
			if (j == i)
			{
				*(p2 + m) = *(p1 + i);
				m++;
			}
		}
		for (i = 0;i < m - 1;i++)
		{
		System.out.printf("%d,",*(p2 + i));
		}
		System.out.printf("%d",*(p2 + m - 1));
	}
}

