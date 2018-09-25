package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int k = 0;
	 int j;
	 int[] a = new int[500];
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
	 for (i = 1;i < 1000;i++,i++)
	 {
	  for (j = 0;j < n;j++)
	  {
	  if (a[j] == i)
	  {
		  k++;
	   if (k == 1)
	   {
		System.out.printf("%d",i);
	   }
	   else
	   {
		   System.out.printf(",%d",i);
	   }
	  }
	  }
	 }

	}
}

