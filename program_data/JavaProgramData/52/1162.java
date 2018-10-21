package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int i;
		int j;
		int m;
		int n;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		p = a;
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
				p + i = Integer.parseInt(tempVar3);
			}
		}
		for (i = n - m;i < n;i++)
		{
			t = (p + i);
			for (j = i - 1;j > i - 1 - n + m;j--)
			{
				*(p + j + 1) = *(p + j);
			}
			*(p + i - n + m) = t;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",*(p + i));
		}
		System.out.printf("%d",*(p + n - 1));
	}


}

