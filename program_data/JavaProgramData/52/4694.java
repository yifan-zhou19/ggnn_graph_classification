package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 void change(int * p,int n,int m);
		 int[] a = new int[100];
		 int n;
		 int m;
		 int i;
		 int[] p = a;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 m = Integer.parseInt(tempVar2);
		 }
		 System.out.print("\n");
		 for (i = 0;i < n;i++,p++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 p = Integer.parseInt(tempVar3);
			 }
		 }
		 p = a;
	 tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		 change(tempRef_p, n, m);
		 p = tempRef_p.argValue;
	}


	public static void change(tangible.RefObject<Integer> p, int n, int m)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 int * i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 int * j;
		 int[] b = new int[100];
		 j = b;
		 i = p.argValue;
		 for (j = b,i = p.argValue;i < p.argValue + n;i++,j++)
		 {

			 if (i < p.argValue + n - m)
			 {
			 *(j + m) = *i;
			 }
			 else
			 {
			  *(j - n + m) = *i;
			 }
		 }
		 for (j = b;j < b + n - 1;j++)
		 {
			 System.out.printf("%d ",*j);
		 }
			 System.out.printf("%d",b[n - 1]);

	}
}

