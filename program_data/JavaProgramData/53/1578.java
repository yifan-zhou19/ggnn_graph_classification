package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int s;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 System.out.print("\n");
	 int[] a = new int[n];
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 a[0] = Integer.parseInt(tempVar2);
	 }
	 for (i = 1;i < n;i++)
	 {
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 a[i] = Integer.parseInt(tempVar3);
		 }
	 }
	 System.out.printf("%d",a[0]);
	 for (i = 1;i < n;i++)
	 {
	  s = 0;
	  for (j = 0;j < i;j++)
	  {
	   if (a[i] == a[j])
	   {
		   s = 1;
		   break;
	   }
	  }
	  if (s == 0)
	  {
		  System.out.printf(",%d",a[i]);
	  }
	 }
	}
}

