package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[] a = new int[10000];
		 int i;
		 int n;
		 int m;
		 int j;
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
				 (a[i]) = Integer.parseInt(tempVar2);
			 }
		 }
		 for (i = 0;i < n;i++)
		 {
			 for (j = 0;j < n;j++)
			 {
				 if (a[i] < a[j])
				 {
					 m = a[i];
					 a[i] = a[j];
					 a[j] = m;
				 }
			 }
		 }
	 for (i = 0;i < n;i++)
	 {
	   if (a[i] % 2 == 0)
	   {
		   a[i] = 0;
	   }
	 }
	 if (a[0] != 0)
	 {
		 System.out.printf("%d",a[0]);
	 }
	 for (i = 1;i < n;i++)
	 {
		 if (a[i] != 0)
		 {
			 System.out.printf(",%d",a[i]);
		 }
	 }
		 return 0;
	}


}

