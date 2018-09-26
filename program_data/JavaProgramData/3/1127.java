package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int k;
	   int i;
	   int j;
	   int[] a = new int[1000];
	   int l = 0;
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
	   for (i = 0;i < n;i++)
	   {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i] = Integer.parseInt(tempVar3);
		  }
	   }
	   for (i = 0;i < n;i++)
	   {
		   for (j = i + 1;j < n;j++)
		   {
			  if (a[i] + a[j] == k)
			  {
				  l = 1;
				  break;
			  }
		   }
		   if (l == 1)
		   {
			   break;
		   }
	   }
		   if (l == 1)
		   {
			   System.out.print("yes\n");
		   }
		   if (l == 0)
		   {
			   System.out.print("no\n");
		   }

		return 0;
	}
}

