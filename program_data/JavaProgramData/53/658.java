package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int[] a = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 int * q;

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
				 a[i] = Integer.parseInt(tempVar2);
			 }
		 }
		 p = a;
		 System.out.printf("%d",*p);
		 for (p = a + 1;p < a + n;p++)
		 {
			 for (q = p - 1;q >= a;q--)
			 {
				 if (*p == *q)
				 {
					 break;
				 }
			 }
			 if (q < a)
			 {
				 System.out.printf(",%d",*p);
			 }
		 }
		 return 0;
	}


}

