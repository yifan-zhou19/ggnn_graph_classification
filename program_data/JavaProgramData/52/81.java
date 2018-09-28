package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		int i;
		int j;
		int[] p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		p = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = n - m,j = 0;i < n;i++,j++)
		{
			q[j] = p[i];
			System.out.printf("%d ",q[j]);
		}
		for (i = 0;i < n - m;i++)
		{
			q[m + i] = p[i];
			if (i != n - m - 1)
			{
			System.out.printf("%d ",q[m + i]);
			}
		}
		System.out.printf("%d",q[n - 1]);
	}

}

