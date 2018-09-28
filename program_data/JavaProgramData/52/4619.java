package <missing>;

public class GlobalMembers
{
	public static int m = 0;
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * change(int x[100],int y,int z);
		int change = new int(int x[100],int y,int z);
		int[] a = new int[100];
		int n;
		int m;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pt;
		int pt;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		pt = change(a, n, m);
		System.out.printf("%d", pt);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d", *(pt + i));
		}
	}
//C++ TO JAVA CONVERTER WARNING: Java has no equivalent to methods returning pointers to value types:
//ORIGINAL LINE: int * change(int x[100],int y,int z)
	public static int change(int[] x, int y, int z)
	{
		int j;
		int k;
		int temp = 0;
		for (j = 0;j < z;j++)
		{
			temp = x[y - 1];
			for (k = y - 2;k >= 0;k = k - 1)
			{
				x[k + 1] = x[k];
			}
			x[0] = temp;
		}
		return (x);
	}
}

