package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int j;
	int t = 0;
	int k;
	int[] a = new int[100000];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * point1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * point2;

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
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		k = Integer.parseInt(tempVar3);
	}

	point1 = a;
	for (i = 0;(i < n) & (t <= n);i++, point1++)
	{
		if (*point1 == k)
		{
				point2 = point1;
				for (j = i;j < n - 1;j++,point2++)
				{
						*point2 = (point2 + 1);
				}
			*point2 = k;
			point1--;
			i--;
			t++;
		}
	}

	point1 = a;
	if (*point1 != k)
	{
		System.out.printf("%ld",*point1);
	}
	point1++;

	for (i = 0;i < n - 1;i++,point1++)
	{
	if (*point1 != k)
	{
		System.out.printf(" %ld",*point1);
	}
	}
	}
}

