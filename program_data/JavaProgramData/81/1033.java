package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int change = new int(int * p,int n,int m);
		int[][] a = new int[5][5];
		int i;
		int j;
		(int)(*p)[5];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *k;
		int k;
		int m;
		int n;
		 p = a;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					*(p + i) + j = tempVar;
				}
			}
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 *(p + i) + 4 = tempVar2;
			 }
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		k = a;
	tangible.RefObject<Integer> tempRef_k = new tangible.RefObject<Integer>(k);
		if (change(tempRef_k, n, m) != 0)
		{
			k = tempRef_k.argValue;
		 for (i = 0;i < 5;i++)
		 {
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",*(*(p + i) + j));
			}
			 System.out.printf("%d\n",*(*(p + i) + 4));
		 }
		}
		 else
		 {
			k = tempRef_k.argValue;
			 System.out.print("error");
		 }
	}
	public static int change(tangible.RefObject<Integer> p, int n, int m)
	{
		int i;
		int j;
		int k;
		if (n < 0 || n>4 || m < 0 || m>4)
		{
			i = 0;
		}
		else
		{
			for (j = 0;j < 5;j++)
			{
			k = (p.argValue+5 * n + j);
		*(p.argValue+5 * n + j) = *(p.argValue+5 * m + j);
			*(p.argValue+5 * m + j) = k;
			}
		i = 1;

		}

		return (i);
	}
}

