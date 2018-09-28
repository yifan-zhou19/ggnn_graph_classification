package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,i,j,n,m,a[200000],k=0;
		int p;
		int i;
		int j;
		int n;
		int m;
		int[] a = new int[200000];
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = a;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p + i) = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (i = 0,p = a;i < n;i++)
		{
			if (*(p + i) == m)
			{
				k++;
				for (j = i;j < n;j++)
				{
					*(p + j) = *(p + j + 1);
				}
				i--;
			}
		}
		for (i = 0,p = a;i < n - k - 1;i++)
		{
			System.out.printf("%d ",*(p + i));
		}
		System.out.printf("%d",*(p + n - k - 1));
	}
}

