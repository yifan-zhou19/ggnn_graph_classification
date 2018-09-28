package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int[] a = new int[300];
		 int n;
		 int i;
		 int j;
		 int k;
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
			 for (j = i + 1;j < n;j++)
			 {
			   for (;a[j] == a[i];)
			   {
				 for (k = j;k < n;k++)
				 {
				  a[k] = a[k + 1];
				  a[n] = 0;
				 }
				 n = n - 1;
			   }
			 }
		 }
		 System.out.printf("%d",a[0]);
		 for (i = 1;i < n;i++)
		 {
		 System.out.printf(",%d",a[i]);
		 }


	}

}

