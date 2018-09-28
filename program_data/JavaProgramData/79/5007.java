package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int[] a = new int[1000];
	   int[] b = new int[1000];
	   int[] c = new int[1000];
	   for (i = 0;;i++)
	   {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a[i] = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   b[i] = Integer.parseInt(tempVar2);
		   }
		   if (b[i] == 0 && a[i] == 0)
		   {
			   break;
		   }
		   else
		   {
		   for (j = 2;j <= a[i];j++)
		   {
			   c[i] = (c[i] + b[i]) % j;
		   }
		   }
	   }
	   for (i = 0;;i++)
	   {
		   if (a[i] == 0 && b[i] == 0)
		   {
			   break;
		   }
		   else
		   {
			   System.out.printf("%d\n", c[i] + 1);
		   }
	   }
	   return 0;
	}
}

