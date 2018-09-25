package <missing>;

public class GlobalMembers
{
	public static int compare(Object elem1, Object elem2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a=null,*b=null;
		int a = null;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b=null;
		int b = null;
		a = (int)elem1;
		b = (int)elem2;
		return (a - b);
	}
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int x = 0;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}

		int[] b = new int[n];
		for (i = 0;i < n;i++)
		{
		b[i] = 0;
		}

		for (i = 0;i < n;i++)
		{
		if (a[i] % 2 == 1)
		{
			b[j] = a[i];
			j++;
		}
		}
		qsort(b,n,(Integer.SIZE / Byte.SIZE),compare);
		for (i = 0;i < n;i++)
		{
		if (b[i] > 0 && flag == 0)
		{
			   System.out.printf("%d",b[i]);
			   flag = 1;
		}
		else if (b[i] != 0)
		{
		System.out.printf(",%d",b[i]);
		}
		}


	}
}

