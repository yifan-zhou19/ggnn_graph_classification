package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
	   int[] a = new int[1000];
	   int[] b = new int[1000];
		int i;
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
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[0] = Integer.parseInt(tempVar3);
	   }
	   for (i = 1;i < n;i++)
	   {
		   String tempVar4 = ConsoleInput.scanfRead(" ");
		   if (tempVar4 != null)
		   {
			   a[i] = Integer.parseInt(tempVar4);
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   for (j = i + 1;j < n;j++)
		   {
		   if ((a[i] + a[j]) == k)
		   {
			   System.out.print("yes");
		   break;
		   }
		   }
		   if ((a[i] + a[j]) == k)
		   {
			   break;
		   }
	   }
	   if ((a[i] + a[j]) != k)
	   {
		   System.out.print("no");
	   }

	   return 0;
	}
}

