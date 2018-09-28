package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static sum(int[][] x, int m, int n)
	{
		int z = 0;
		int i;
		for (i = 0;i < n;i++)
		{
			z = z + *(x[0] + i) + *(x[m - 1] + i);
		}
		for (i = 1;i < m - 1;i++)
		{
			z = z + *(x[i]) + *(x[i] + n - 1);
		}
		return (z);
	}
	public static int Main()
	{
		int k;
		int i;
		int j;
		int m;
		int n;
		int z;
		int l;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a[100];
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (l = 0;l < k;l++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (i = 0;i < m;i++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				a[i] = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
			}
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i] + j = Integer.parseInt(tempVar4);
					}
				}
			}
			z = sum(a,m,n);
			System.out.printf("%d\n",z);
		}
	}
}

