package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[101];
	int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pt1;
	int pt1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pt2;
	int pt2;
	int c;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		if (i == 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		else
		{
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
	}
	for (i = 0;i < (n / 2);i++)
	{
	pt1 = a[n - 1 - i];
	pt2 = a[i];
	c = pt1;
	a[n - 1 - i] = pt2;
	a[i] = c;
	}
	for (i = 0;i < n;i++)
	{
		if (i == 0)
		{
	System.out.printf("%d",a[i]);
		}
		else
		{
	System.out.printf(" %d",a[i]);
		}
	}
	return 0;
	}

}

