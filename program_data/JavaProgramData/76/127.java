package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] a = new int[MAX];
	   int[] b = new int[MAX];
	   int n;
	   int i;
	   int j;
	   int c;
	   int d;
	   int l;
	   l = 0;
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
	   for (j = 0;j < n;j++)
	   {
		  for (i = n - 1;i > j;i--)
		  {
			 if (a[i] < a[i - 1])
			 {
				c = a[i - 1];
				a[i - 1] = a[i];
				a[i] = c;
				c = b[i - 1];
				b[i - 1] = b[i];
				b[i] = c;
			 }
		  }
	   }
	   d = b[0];
	   for (i = 1;i < n;i++)
	   {
		  if (d < b[i - 1])
		  {
			 d = b[i - 1];
		  }
		  if (a[i] > d)
		  {
			 l = 1;
			 System.out.print("no");
			 break;
		  }
	   }
	   if (l == 0)
	   {
		  if (d < b[n - 1])
		  {
		  d = b[n - 1];
		  }
		  System.out.printf("%d %d",a[0],d);
	   }
	   return 0;
	}
}

