package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int[] x = new int[10000];
		int sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 k = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= k;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 m = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 n = Integer.parseInt(tempVar3);
		 }
	  sum = 0;
	  for (p = x;p < x + m * n;p++)
	  {
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  p = Integer.parseInt(tempVar4);
		  }
	  }
	  for (p = x;p < x + n;p++)
	  {
		  sum = sum + *p;
	  }
	  for (p = x + (m - 1) * n;m != 1 && p < x + n * m;p++)
	  {
		  sum = sum + *p;
	  }
	  for (p = x + n;p < x + n * (m - 1);p = p + n)
	  {
		  sum = sum + *p;
	  }
	  for (p = x + n + n - 1;p < x + n * m - 1;p = p + n)
	  {
		  sum = sum + *p;
	  }
	  System.out.printf("%d\n",sum);
	 }
	}
}

