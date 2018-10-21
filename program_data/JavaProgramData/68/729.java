package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int i;
	   int j;
	   int[] a = new int[50001];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 2;i <= n;i++)
	   {
		   a[i] = 0;
		   for (j = 2;j <= (int) Math.sqrt(i);j++)
		   {
			   if (i % j == 0)
			   {
			   a[i] = 1;
			   break;
			   }
		   }
	   }
	   for (i = 6;i <= n;i = i + 2)
	   {
		 for (j = 3;j <= i / 2;j = j + 2)
		 {
		   if (a[j] == 0 && a[i - j] == 0)
		   {
		   System.out.printf("%d=%d+%d\n",i,j,i - j);
		   break;
		   }
		 }
	   }
	}
}

