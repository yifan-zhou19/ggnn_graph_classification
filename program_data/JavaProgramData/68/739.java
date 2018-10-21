package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	   int[] a = new int[10000];
	   int m;
	   int n;
	   int i;
	   int j = 1;
	   int k;
	   int l;
	   a[0] = 2;
	   for (m = 3;m <= 50000;m++)
	   {
		 for (i = 2;i <= Math.sqrt((float)m);i++)
		 {
		   if (m % i == 0)
		   {
			   break;
		   }
		 }
		 if (i > Math.sqrt((float)m))
		 {
		  a[j++] = m;
		 }

	   }
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 3;i <= n / 2;i++)
	   {
		 System.out.printf("%d=",2 * i);
		 for (k = 0,l = j - 1;k <= l;)
		 {
		   if (a[k] + a[l] == 2 * i)
		   {
			   System.out.printf("%d+%d\n",a[k],a[l]);
			   break;
		   }
		   else if (a[k] + a[l] < 2 * i)
		   {
			   k++;
		   }
			 else
			 {
				 l--;
			 }
		 }
	   }
		   System.out.print("\n");

	}

}

