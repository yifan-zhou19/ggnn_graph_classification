package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int s;
	 int i;
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
	 System.out.printf("%d",a[0]);
	 for (p = a + 1,i = 1;p <= (a + n - 1);i++,p++)
	 {
		 for (q = a,s = 0;q <= p - 1;q++)
		 {
			 if (*q != *p)
			 {
				 s++;
			 }
			 else
			 {
				 break;
			 }
		 }
		 if (s == i)
		 {
			 System.out.printf(",%d",*p);
		 }
	 }

	}
}

