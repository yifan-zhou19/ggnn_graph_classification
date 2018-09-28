package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int[] a = new int[100000];
	   int k;
	   int x = 0;
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
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   k = Integer.parseInt(tempVar3);
	   }
	   for (i = 0;i < n - x;)
	   {
		   if (a[i] != k)
		   {
			   i++;
			   continue;
		   }
		 if (a[i] == k && i < n - 1 - x)
		 {
		for (j = i + 1;j < n - x;j++)
		{
			a[j - 1] = a[j];
		}
		x++;
		 }
		   if (a[i] == k && i == n - x - 1)
		   {
			   x++;
			   break;
		   }
	   }
	   if (n - x != 0)
	   {
	   for (i = 0;i < n - x - 1;i++)
	   {
		   System.out.printf("%ld ",a[i]);
	   }
	   System.out.printf("%ld",a[n - x - 1]);
	   }


	}
}

