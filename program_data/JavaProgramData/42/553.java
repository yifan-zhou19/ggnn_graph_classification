package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,k,j,i,a[100000],n,m=0;
		int p;
		int k;
		int j;
		int i;
		int[] a = new int[100000];
		int n;
		int m = 0;
	p = a;
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
	for (i = 0;i < n;i++)
	{
		if (*(p + i) == k)
		{
			while (*(p + i) == k)
			{
				for (j = i;j < n - m;j++)
				{
					a[j] = a[j + 1];
				}
				m = m + 1;
			}


		}


	}

	for (i = 0;i < n - m - 1;i++,p++)
	{
	System.out.printf("%d ", p);
	}

	System.out.printf("%d", p);


	}

}

