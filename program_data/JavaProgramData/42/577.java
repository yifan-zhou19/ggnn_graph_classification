package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int[] a = new int[200000];
	 int t = 0;
	 int i;
	 int j;
	 int n;
	 int m;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 int * p;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 p = a;
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  p++ = Integer.parseInt(tempVar2);
	  }
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 m = Integer.parseInt(tempVar3);
	 }
	 p = a;
	 for (i = 0,t = 0;i < n;i++)
	 {
	  if (*(p + i) == m)
	  {
		  continue;
	  }
	  else
	  {
		  *(p + n + t) = *(p + i);
		  t++;
	  }
	 }
	 p = a;
	 for (i = n;i < n + t - 1;i++,p++)
	 {
	  System.out.printf("%d ",*(p + n));
	 }
	 if (t != 0)
	 {
	 System.out.printf("%d",a[n + t - 1]);
	 }
	}
}

