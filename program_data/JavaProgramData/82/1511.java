package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j = 0;
	   int[] a = new int[100];
	   int[] b = new int[100];
	   int[] c = new int[100];
	   int m;
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
		   c[i] = 0;
	   }
	   for (i = 0;i < n;i++)
	   {
		   if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
		   {
			   c[j]++;
		   }
		   else
		   {
			   j++;
		   }
	   }
	   m = c[0];


	   for (i = 0;i < j + 1;i++)
	   {

		   if (m < c[i])
		   {
			   m = c[i];

		   }

	   }
	   System.out.printf("%d",m);
		return 0;
	}
}

