package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int k;
	   int m;
	   int i = 1;
	   int j;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   k = Integer.parseInt(tempVar2);
	   }
	   while (i >= 0)
	   {
		   m = n * i + k;
	   for (j = 2;j <= n + 1;j++)
	   {
		   if (j == n + 1)
		   {
			break;
		   }
		 if (m % (n - 1) != 0)
		 {
		   break;
		 }
		 else
		 {
		   m = m * n / (n - 1) + k;
		 }
	   }
	   if (j == n + 1)
	   {
		   System.out.printf("%d",m);
	   break;
	   }
	   else
	   {
		   i++;
	   }
	   }
	}
}

