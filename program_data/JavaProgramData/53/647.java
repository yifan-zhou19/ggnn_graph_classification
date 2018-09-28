package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 int * q;
	 int[] a = new int[300];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (p = a;p <= (a + n - 1);p++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 *p = Integer.parseInt(tempVar2);
		 }
	 }
	 for (p = a;p <= (a + n - 1);p++)
	 {
		 for (q = p + 1;q <= (a + n - 1);q++)
		 {
			 if (*q == *p)
			 {
				 *q = 0;
			 }
		 }
	 }
	 System.out.printf("%d",a[0]);
	 for (p = (a + 1);p <= (a + n - 1);p++)
	 {
		 if (*p != 0)
		 {
			 System.out.printf(",%d",*p);
		 }
	 }
	}
}

