package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int j;
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
		scanf("\n");
		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		p = b;
	if (i = n - m)
	{
		p = a[i];
		System.out.printf("%d", p);
	}
		for (i = n - m + 1;i < n;i++)
		{
			j = (i + m) % (n - 1);
			*(p + j - 1) = a[i];

			System.out.printf(" %d",*(p + j - 1));
		}


		for (i = 0;i < n - m;i++)
		{
			*(p + i + m) = a[i];
			System.out.printf(" %d",*(p + i + m));
		}


	}








}

