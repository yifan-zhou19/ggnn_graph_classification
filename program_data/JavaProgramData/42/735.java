package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int del = new int(int * x,int n,int m);
	int[] a = new int[100000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
	int p;
	p = a;
	int n;
	int m;
	int i;
	int k;

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
		p + i = Integer.parseInt(tempVar2);
	}
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
	k = del(tempRef_p, n, m);
	p = tempRef_p.argValue;
	for (i = 0;i < n - k - 1;i++)
	{
	System.out.printf("%d ",*(p + i));
	}
	System.out.printf("%d",*(p + n - k - 1));
	}
		public static int del(tangible.RefObject<Integer> x, int n, int m)
		{
			int i;
			int j;
			int k = 0;
		for (i = 0;i < n;i++)
		{
			if (*(x.argValue + i) == m)
			{
			for (j = i;j < n - k;j++)
			{
		*(x.argValue + j) = *(x.argValue + j + 1);
			}
		k++;
		i--;
			}


		}
		return k;
		}
}

