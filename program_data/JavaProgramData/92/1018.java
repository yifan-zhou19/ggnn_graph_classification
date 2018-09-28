package <missing>;

public class GlobalMembers
{
	public static int Compare(Object elem1, Object elem2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1,*p2;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		p1 = (int) elem1;
		p2 = (int) elem2;
		return (p2) - p1;
	}
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int k = 0;
		int m = 0;
		int r = 0;
		int[] a = new int[1100];
		int[] b = new int[1100];
		int[] c = new int[1100];
		int[] d = new int[1100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	   while (n != 0)
	   {
		   for (i = 0;i <= n - 1;i++)
		   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a[i] = Integer.parseInt(tempVar2);
			   }
		   }
		   for (j = 0;j <= n - 1;j++)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   b[j] = Integer.parseInt(tempVar3);
			   }
		   }
		   qsort(a,n,(Integer.SIZE / Byte.SIZE),Compare);
		   qsort(b,n,(Integer.SIZE / Byte.SIZE),Compare);
		   for (i = 0;i <= n - 1;i++)
		   {
			   for (k = 0;k <= n - 1;k++)
			   {
				   if (a[k] > b[k])
				   {
					  m = m + 1;
				   }
				   if (a[k] == b[k])
				   {
					  m = m + 0;
				   }
				   if (a[k] < b[k])
				   {
					  m = m - 1;
				   }
			   }
			   c[i] = m;
			   m = 0;
			   for (j = n - 1;j >= 0;j--)
			   {
				   a[j + 1] = a[j];
			   }
			   a[0] = a[n];
		   }
		   qsort(c,n,(Integer.SIZE / Byte.SIZE),Compare);
		   d[r] = c[0] * 200;
		   r++;
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   n = Integer.parseInt(tempVar4);
		   }
	   }
	   for (i = 0;i <= r - 1;i++)
	   {
		   System.out.printf("%d\n",d[i]);
	   }
	}

}

