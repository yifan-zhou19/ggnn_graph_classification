package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int[] a = new int[10000];
	   int flag = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 3;i <= n;i++)
	   {
	   for (j = 2;j < i;j++)
	   {
		   if (i % j == 0)
		   {
	   break;
		   }
	   }
	   if (j == i)
	   {
		   flag += 1;
	   a[flag] = i;
	   }
	   }
		 for (i = 1;i <= flag;i++)
		 {
		 for (j = i;j <= flag;j++)
		 {
		 if (a[i] + a[j] == n)
		 {
			 System.out.printf("%d %d\n",a[i],a[j]);
		 break;
		 }
		 }
		 }
		 return 0;
	}

}

