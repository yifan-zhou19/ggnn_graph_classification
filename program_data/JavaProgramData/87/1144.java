package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	   int[] a = new int[1000];
	   int[] b = new int[1000];
	   int[] c = new int[1000];
	   int[] d = new int[1000];
	   int[] e = new int[1000];
	   int[] f = new int[1000];
	   int[] g = new int[1000];
	   int i;
	   for (i = 0;i <= 11;i = i + 1)
	   {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a[i] = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   b[i] = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   c[i] = Integer.parseInt(tempVar3);
	   }
	   String tempVar4 = ConsoleInput.scanfRead(" ");
	   if (tempVar4 != null)
	   {
		   d[i] = Integer.parseInt(tempVar4);
	   }
	   String tempVar5 = ConsoleInput.scanfRead(" ");
	   if (tempVar5 != null)
	   {
		   e[i] = Integer.parseInt(tempVar5);
	   }
	   String tempVar6 = ConsoleInput.scanfRead(" ");
	   if (tempVar6 != null)
	   {
		   f[i] = Integer.parseInt(tempVar6);
	   }
	   }
	   for (i = 0;i <= 10;i = i + 1)
	   {
		   g[i] = (d[i] + 12 - a[i]) * 3600 + (e[i] - b[i]) * 60 + (f[i] - c[i]);
		   if (a[i] != 0)
		   {
		   System.out.printf("%d\n",g[i]);
		   }
	   }



	return 0;
	}
}

