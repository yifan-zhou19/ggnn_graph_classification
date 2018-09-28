package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] a = new int[50000];
	int[] b = new int[50000];
	int j;
	int t;
	int p;
	int max;
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
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   b[i] = Integer.parseInt(tempVar3);
		   }
	   }

	   for (i = 0;i < n;i++)
	   {
		   for (j = 0;j < n;j++)
		   {
			   if (a[j] < a[j - 1])
			   {
				   t = a[j];
				   a[j] = a[j - 1];
				   a[j - 1] = t;
				   t = b[j];
				   b[j] = b[j - 1];
				   b[j - 1] = t;
			   }
		   }
	   }

	   p = 2;
	   max = b[0];
	   for (i = 0;i < n;i++)
	   {
		   if (a[i + 1] > b[i] && i == 0)
		   {
			  p = 1;
			  break;
		   }
		   if (a[i + 1] > b[i] && i != 0 && b[i] >= b[i - 1])
		   {
			  p = 1;
			  break;
		   }
		   if (b[i] > max)
		   {
			   max = b[i];
		   }
	   }

	   if (p == 2)
	   {
		   System.out.printf("%d %d",a[0],max);
	   }
	   if (p == 1)
	   {
		   System.out.print("no");
	   }
	   return 0;
	}


}

