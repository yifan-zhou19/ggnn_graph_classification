package <missing>;

public class GlobalMembers
{
	public static int compare(Object x, Object y)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1,*p2;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		p1 = (int)x;
		p2 = (int)y;
		return (p2) - p1;
	}
	public static int Main()
	{
	   while (true)
	   {
	   int x = 0;
	   int i;
	   int j;
	   int k;
	   int n;
	   int[] a = new int[1000];
	   int[] b = new int[1000];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   if (n == 0)
	   {
		 break;
	   }
	   for (i = 0;i < n;i++)
	   {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
	   }
	   for (i = 0;i < n;i++)
	   {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b[i] = Integer.parseInt(tempVar3);
		  }
	   }
	   qsort(a,n,(Integer.SIZE / Byte.SIZE),compare);
	   qsort(b,n,(Integer.SIZE / Byte.SIZE),compare);
	   for (i = 0;i < n;i++)
	   {
		  if (a[i] > b[i])
		  {
			 x++;
		  }
		  if (a[i] < b[i] || a[i] == b[i])
		  {
			 for (j = (n - 1);j >= 0;j--)
			 {
				  if (a[j] > b[j])
				  {
					 x++;
				  }
				  if (a[j] < b[j] || a[j] == b[j])
				  {
					 n = j;
					 if (i == j && a[i] == b[i])
					 {
						break;
					 }
					 for (k = i;k < n;k++)
					 {
						b[k] = b[k + 1];
					 }
					 if (a[j] < b[i])
					 {
						 x--;
					 }
					 break;
				  }
			 }
			 i--;
		  }
	   }
	   System.out.printf("%d\n",x * 200);
	   }
	}


}

