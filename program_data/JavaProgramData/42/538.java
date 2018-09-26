package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int i;
	 int sum = 0;
	 int j;
	 int b;
	 int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
	 int p;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int[] a = new int[n];
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = Integer.parseInt(tempVar2);
	  }
	 }
	 p = a;
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 b = Integer.parseInt(tempVar3);
	 }
	 for (i = 0;i < n;i++)
	 {
	  if (*(p + i) == b)
	  {
		  sum++;
	  }
	 }
	 for (i = 0;i < (n - sum);i++)
	 {
		if (*(p + i) == b)
		{
			 for (j = i;j < n - 1;j++)
			 {
				 *(p + j) = *(p + j + 1);
			 }
		  i--;
		}
	 }
	 for (i = 0;i < (n - sum - 1);i++)
	 {
	  System.out.printf("%d ",*(p + i));
	 }
	  System.out.printf("%d",*(p + i));
	}


}

