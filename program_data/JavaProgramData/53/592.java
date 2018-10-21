package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] a = new int[300];
	   int n;
	   int i;
	   int j;
	   int k;
	   int l;
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
	   for (j = 0;j < n;j++)
	   {
	   for (k = j + 1;k < n;k++)
	   {
	   if (a[j] == a[k])
	   {
	   a[k] = 0;
	   }
	   }
	   }
	   System.out.printf("%d",a[0]);
	   for (l = 1;l < n;l++)
	   {
	   if (a[l] != 0)
	   {
	   System.out.printf(",%d",a[l]);
	   }
	   }
	}
}

