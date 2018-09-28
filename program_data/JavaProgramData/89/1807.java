package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[] a = new int[100000];
		 int[] b = new int[100000];
		 int[] c = new int[100000];
		 int n;
		 int i;
		 int j;
		 int k;
		 int s = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 0;;i++)
		 {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a[i] = Integer.parseInt(tempVar2);
			   }
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   b[i] = Integer.parseInt(tempVar3);
			   }
			   if (a[i] == 0 && b[i] == 0)
			   {
			   break;
			   }
		 }
		 for (j = 0;j < i;j++)
		 {
		 c[b[j]] = c[b[j]] + 1;
		 }
		 for (k = 0;k < n;k++)
		 {
		 if (c[k] == n - 1)
		 {
			s++;
			System.out.printf("%d",k);
		 }
		 }
		 if (s == 0)
		 {
		 System.out.print("NOT FOUND");
		 }
	}

}

