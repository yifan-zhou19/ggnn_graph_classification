package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int j;
	 int m = 0;
	 int n;
	 int[] a = new int[100000];
	 int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
	 int p;
	 p = a;
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
		 k = Integer.parseInt(tempVar3);
	 }
	 for (i = 0;i < n - m;i++)
	 {
	  if (*(p + i) == k)
	  {
		  for (j = i + 1;j < n - m + 1;j++)
		  {
			  *(p + j - 1) = *(p + j);
		  }
	   m++;
	   i--;
	  }
	 }
	  for (i = 0;i < n - m - 1;i++)
	  {
	  System.out.printf("%d ",*(p + i));
	  }
	  System.out.printf("%d",*(p + i));
	}

}

