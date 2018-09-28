package <missing>;

public class GlobalMembers
{
	public static int Compare(Object elem1, Object elem2)
	{
		return *((int)(elem1)) - (int)(elem2);
	}
	public static int Main()
	{
		int n1;
		int n2;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a1,*a2;
		int a1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a2;
		int a2;
		int i1;
		int i2;
		int i3;
		int i4;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a1 = (int)malloc((Integer.SIZE / Byte.SIZE) * n1);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a2 = (int)malloc((Integer.SIZE / Byte.SIZE) * n2);
		for (i1 = 0;i1 < n1;i1++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a1 + i1 = Integer.parseInt(tempVar3);
			}
		}
		for (i2 = 0;i2 < n2;i2++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a2 + i2 = Integer.parseInt(tempVar4);
			}
		}
		qsort(a1,n1,(Integer.SIZE / Byte.SIZE),Compare);
		qsort(a2,n2,(Integer.SIZE / Byte.SIZE),Compare);
		for (i3 = 0;i3 < n1;i3++)
		{
			System.out.printf("%d ",a1[i3]);
		}
		for (i4 = 0;i4 < n2 - 1;i4++)
		{
			System.out.printf("%d ",a2[i4]);
		}
		System.out.printf("%d",a2[n2 - 1]);
	}
}

