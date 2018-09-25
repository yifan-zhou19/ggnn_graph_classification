package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int m;
		 int i;
		 int j;
		 int k;
		 int[] a = new int[100000];
		 int[] c = new int[100000];
		 int[] b = new int[100000];
		 m = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < n;i++)
		 {
		 c[i] = i;
		 }
		 for (i = 0,j = 0;;i++,j++)
		 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 b[i] = Integer.parseInt(tempVar3);
		 }
		 if (a[i] == 0 && b[i] == 0)
		 {
		 break;
		 }
		 }
		 for (k = 0;k < n;k++)
		 {
		   for (i = 0;i < j;i++)
		   {
			   if (a[i] == c[k])
			   {
			   break;
			   }
			   else if (b[i] == c[k])
			   {
			   m = m + 1;
			   }
		   }
		   if (m == (n - 1))
		   {
			   System.out.printf("%d",c[k]);
			   break;
		   }
		   m = 0;
		 }
	}



}

