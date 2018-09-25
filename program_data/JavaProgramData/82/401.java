package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] a = new int[100];
	   int[] b = new int[100];
	   int n;
	   int i;
	   int c = 0;
	   int[] d = new int[100];
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
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   b[i] = Integer.parseInt(tempVar3);
	   }
	   if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
	   {
	   c++;
	   d[i] = 0;
	   }
	else
	{
		d[i] = c;
	c = 0;
	}
	   }
	   for (i = 0;i < n;i++)
	   {
	   if (d[i] > d[i + 1])
	   {
	   d[i + 1] = d[i];
	   }
	   }
	   if (d[n - 1] >= c)
	   {
	   System.out.printf("%d\n",d[n - 1]);
	   }
	   else
	   {
	   System.out.printf("%d\n",c);
	   }
	   return 0;
	}
}

