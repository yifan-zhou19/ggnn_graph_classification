package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int[] a = new int[1000];
	 int[] b = new int[1000];
	 int i;
	 int j;
	 int n;
	 int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,*q;
	 int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
	 int q;
	 p = a;
	 q = b;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i <= n - 1;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  p + i = Integer.parseInt(tempVar2);
	  }
	 }
	 t = 0;
	 for (i = 0;i <= n - 1;i++)
	 {
	  for (j = 0;j <= i - 1;j++)
	  {
	   if (*(p + i) == *(p + j))
	   {
		   break;
	   }
	  }
	  if (j > i - 1)
	  {
		*(q + t) = *(p + i);
		t++;
	  }
	 }
	  for (i = 0;i <= t - 2;i++)
	  {
	   System.out.printf("%d,",*(q + i));
	  }
	  System.out.printf("%d",*(q + t - 1));

	}
}

