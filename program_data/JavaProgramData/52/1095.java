package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int b;
		int n;
		int m;
		int i;
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
		p = a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		for (i = n - m;i < n;i++)
		{
			*(q + i + m - n) = *(p + i);
		}
		for (i = 0;i < n - m;i++)
		{
			*(q + i + m) = *(p + i);
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",*(q + i));
		}
		System.out.printf("%d",*(q + n - 1));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(q);
		return 0;
	}

}

