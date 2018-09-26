package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[100];
	int max1;
	int max2;
	int n;
	int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pa;
	int pa;
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
	pa = a;
	max1 = a[0];
	for (i = 1;i < n;i++)
	{
		if (a[i] > max1)
		{
		max1 = a[i];
		pa = a[i];
		}
	}
	pa = null;
	pa = a;
	max2 = a[0];
	for (i = 1;i < n;i++)
	{
		if (a[i] > max2)
		{
		max2 = a[i];
		}
	}
	System.out.printf("%d\n%d",max1,max2);
	}

}

