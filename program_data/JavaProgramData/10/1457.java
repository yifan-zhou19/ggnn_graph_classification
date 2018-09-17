package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int[] b;
	   int max;
	   int maxn = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
	   int a;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   a = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
	   b = new int[n];
	   for (i = 0;i < n;i++)
	   {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a + i = Integer.parseInt(tempVar2);
			 }
			 b[i] = 0;
	   }
	   for (i = n - 1;i > -1;i--)
	   {
		   max = 0;
		   for (j = n - 1;j > i;j--)
		   {
			 if (a[j] <= a[i] && b[j] >= max)
			 {
			   max = b[j];
			 }
		   }
		   b[i] = max + 1;
		   if (b[i] > maxn)
		   {
			 maxn = b[i];
		   }
	   }
	   System.out.printf("%d\n",maxn);
	}

}

