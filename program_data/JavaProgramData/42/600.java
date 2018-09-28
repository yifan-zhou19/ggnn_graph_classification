package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int m;
	 int i;
	 int j = 0;
	 int[] a = new int[100001];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 int * q;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *o;
	 int o;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (p = a;p - a < n;p++)
	 {
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 p = Integer.parseInt(tempVar2);
	 }
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 m = Integer.parseInt(tempVar3);
	 }
	 for (p = a;p - a < n - j;)
	 {
		 if (*p == m)
		 {
		   for (q = p + 1;q - a < n;q++)
		   {
		*(q - 1) = *q;
		   }
		j++;
		 }
	  else
	  {
		  p++;
	  }
	 }
	 for (p = a;p - a < n - j - 1;p++)
	 {
	 System.out.printf("%ld ",*p);
	 }
	 System.out.printf("%ld",*p);
	}

}

