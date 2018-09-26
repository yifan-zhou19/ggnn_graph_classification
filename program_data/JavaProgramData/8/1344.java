package <missing>;

public class GlobalMembers
{
	public static int compare(Object elem1, Object elem2)
	{
		  return ((int)elem1) - ((int) elem2);
	}
	public static int Main()
	{
		  int N;
		  int M;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  N = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  M = Integer.parseInt(tempVar2);
		  }
		  int[] a = new int[N];
		  int[] b = new int[M];
		  for (i = 0;i < N;i++)
		  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  a[i] = Integer.parseInt(tempVar3);
				  }
		  }
		  for (i = 0;i < M;i++)
		  {
				  String tempVar4 = ConsoleInput.scanfRead();
				  if (tempVar4 != null)
				  {
					  b[i] = Integer.parseInt(tempVar4);
				  }
		  }
		   qsort(a,N,(Integer.SIZE / Byte.SIZE),compare);
		   for (i = 0;i < N - 1;i++)
		   {
				  System.out.printf("%d ",a[i]);

		   }
		   System.out.printf("%d ",a[i]);
			qsort(b,M,(Integer.SIZE / Byte.SIZE),compare);
		   for (i = 0;i < M - 1;i++)
		   {
				  System.out.printf("%d ",b[i]);

		   }
		   System.out.printf("%d\n",b[i]);

		   return 0;
	}

}

