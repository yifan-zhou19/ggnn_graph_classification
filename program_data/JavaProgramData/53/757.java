package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int n;
	 int j;
	 int[] a = new int[300];
	 int[] b = new int[300];
	 int[] c = new int[300];
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
	 for (i = 0;i < n;i++)
	 {
	  if (b[i] == 0)
	  {
		 for (j = i + 1;j < n;j++)
		 {
		 if (a[j] == a[i])
		 {
			 b[j] = 1;
		 }
		 }
	  }
	   else
	   {
		   continue;
	   }
	 }
	 for (i = 0,j = 0;i < n;i++)
	 {
	 if (b[i] == 0)
	 {
		 c[j++] = a[i];
	 }
	 }
	 for (i = 0;i < j - 1;i++)
	 {
	 System.out.printf("%d,",c[i]);
	 }
	 System.out.printf("%d",c[j - 1]);

	}


}

