package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,*q,i,j,n,k,a[300],b[300];
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int i;
		int j;
		int n;
		int k;
		int[] a = new int[300];
		int[] b = new int[300];
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
		p = a;
		k = 1;
		q = b;
		q = p;
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < k;j++)
			{
				if (*(p + i) == *(q + j))
				{
			break;
				}
			}
		if (j == k)
		{
			*(q + j) = *(p + i);
		k++;
		}
		}
		for (i = 0;i < k - 1;i++)
		{
		System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[k - 1]);
		return 0;
	}

}

