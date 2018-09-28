package <missing>;

public class GlobalMembers
{
	public static int Compare(Object elem1, Object elem2)
	{
		if ((int)elem1 > (int)elem2)
		{
			return 1;
		}
		if ((int)elem1 == (int)elem2)
		{
			return 0;
		}
		if ((int)elem1 < (int)elem2)
		{
			return -1;
		}
	}
//C++ TO JAVA CONVERTER WARNING: Java has no equivalent to methods returning pointers to value types:
//ORIGINAL LINE: int * shuru(int m,int *a)
	public static int[] shuru(int m, int[] a)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc(m * (Integer.SIZE / Byte.SIZE));
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = tempVar;
		}
		for (i = 1;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				a[i] = tempVar2;
			}
		}
		return a;
	}
	public static int Main()
	{
		int suma;
		int sumb;
		int i;
		int[] a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			suma = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			sumb = Integer.parseInt(tempVar2);
		}
		a = shuru(suma, a);
		b = shuru(sumb, b);
		qsort(a,suma,(Integer.SIZE / Byte.SIZE),Compare);
		qsort(b,sumb,(Integer.SIZE / Byte.SIZE),Compare);
		System.out.printf("%d",a[0]);
		for (i = 1;i < suma;i++)
		{
			System.out.printf(" %d",a[i]);
		}
		System.out.printf(" %d",b[0]);
		for (i = 1;i < sumb;i++)
		{
			System.out.printf(" %d",b[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(b);
	}
}

