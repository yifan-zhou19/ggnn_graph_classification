package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100];
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		void f(int * p,int m);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		q = a;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				q + i = Integer.parseInt(tempVar2);
			}
		}
	tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
		f(tempRef_a, n);
		a = tempRef_a.argValue;
		System.out.printf("%d", q);
		for (i = 1;i < n;i++)
		{
			if (*(q + i) != 12345)
			{
			System.out.printf(",%d",*(q + i));
			}
		}



	}
	public static void f(tangible.RefObject<Integer> p, int m)
	{
		int i;
		int j;
		for (j = 0;j < m;j++)
		{
	   for (i = j + 1;i < m;i++)
	   {
		   if (*(p.argValue + j) == *(p.argValue + i))
		   {
			   *(p.argValue + i) = 12345;
		   }
	   }
		}


	}
}

