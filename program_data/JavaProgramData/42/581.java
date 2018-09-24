package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int[] a = new int[100000];
	   int m;
	   int i;
	   int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
	   int p;
	   int s = 0;
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
		   a + i = tempVar2;
	   }
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   m = Integer.parseInt(tempVar3);
	   }
	   for (i = 0;i < n - s;i++)
	   {
		   if (a[i] == m)
		   {
			   for (j = i;j < n - s;j++)
			   {
			a[j] = (a + j + 1);
			   }
		   s++;
		   i--;
		   }
	   }
	   for (i = 0;i < n - s - 1;i++)
	   {
		   System.out.printf("%d ",a[i]);
	   }
	   System.out.printf("%d",a[i]);
	}
}

