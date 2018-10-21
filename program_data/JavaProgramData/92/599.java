package <missing>;

public class GlobalMembers
{
	public static int compare(Object a, Object b)
	{
		  return *((int)a) - (int)b;
	}
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int n;
		  int t;
		  int[] a = new int[1000];
		  int[] b = new int[1000];
		  int max;
		  int w;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  while (n != 0)
		  {
					 for (i = 0;i < n;i++)
					 {
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a[i] = Integer.parseInt(tempVar2);
						 }
					 }
					 for (j = 0;j < n;j++)
					 {
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 b[j] = Integer.parseInt(tempVar3);
						 }
					 }
					 qsort(a,n,(Integer.SIZE / Byte.SIZE),compare);
					 qsort(b,n,(Integer.SIZE / Byte.SIZE),compare);
					 max = -n;
					 for (t = 0;t < n;t++)
					 {
						 w = 0;
						 for (k = 0;k < n;k++)
						 {
							 if (a[(k + t) % n] < b[k])
							 {
							   w--;
							 }
							 if (a[(k + t) % n] > b[k])
							 {
							   w++;
							 }
						 }
						 if (w > max)
						 {
							 max = w;
						 }
					 }
					 System.out.printf("%d\n",200 * max);
					 String tempVar4 = ConsoleInput.scanfRead();
					 if (tempVar4 != null)
					 {
						 n = Integer.parseInt(tempVar4);
					 }
		  }
	}



}

