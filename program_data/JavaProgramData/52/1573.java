package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,*q,m,n,i;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int m;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int[] dk = new int[100];
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(dk[i]) = Integer.parseInt(tempVar3);
			}
		}
		p = dk;
		q = dk[n - m];
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d ",(q));
			q++;
		}
		for (i = 0;i < n - m - 1;i++)
		{
		 System.out.printf("%d ",(p));
		 p++;
		}
		System.out.printf("%d",(p));
		return 0;
	}
}

