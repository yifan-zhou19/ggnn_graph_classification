package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	 int n;
	 int m;
	 int i;
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
	  for (i = 1;i <= n;i++)

	  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i] = Integer.parseInt(tempVar3);
		  }
	  }
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * x;
		x = a[n];
		for (i = 1;i <= n;i++)
		{
		x++;
		*x = a[i];
		}
	  System.out.printf("%d",a[n - m + 1]);
	  for (i = n - m + 2;i <= 2 * n - m;i++)
	  {
	  System.out.printf(" %d",a[i]);
	  }


	}


}

