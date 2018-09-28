package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * j;
		int n;
		int[] x = new int[100];
		int[] y = new int[100];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = x;i < x + n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 i = Integer.parseInt(tempVar2);
		 }
	 }
	 for (j = y,i = i - 1;i >= x;i--,j++)
	 {
		 *j = i;
	 }
	 for (i = x,j = y;i < x + n;i++,j++)
	 {
		 *i = j;
	 }
	 for (i = x;i < x + n - 1;i++)
	 {
		 System.out.printf("%d ",*i);
	 }
	 System.out.printf("%d",*i);
	}
}

