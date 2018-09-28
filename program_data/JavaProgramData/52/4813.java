package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 void move(int array[],int x,int y);
		 int n;
		 int m;
		 int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 int * p;
		 int[] a = new int[100];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 m = Integer.parseInt(tempVar2);
		 }
		 for (p = a;p <= a + n - 1;p++)
		 {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 p = Integer.parseInt(tempVar3);
		 }
		 }
		 move(a, n, m);
		 for (p = a;p <= a + n - 2;p++)
		 {
		 System.out.printf("%d ",*p);
		 }
		 System.out.printf("%d",a[n - 1]);
		 return 0;
	}
	public static void move(int[] array, int x, int y)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 int * p; //?arrayend????????????????
		 int arrayend = array[x - 1];

		   for (p = array + x - 1;p >= array + 1;p--)
		   {
		   *p = (p - 1);
		   }
		   array[0] = arrayend;
		   y--;
		   if (y > 0)
		   {
			   move(array, x, y);
		   }
	}





}

