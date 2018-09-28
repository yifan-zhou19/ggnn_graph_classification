package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] a = new int[300];
	   int i;
	   int j;
	   int m;
	   int n;
	   int k;
	   char c;
	   for (i = 0;;i++)
	   {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a[i] = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead(null, 1);
		   if (tempVar2 != null)
		   {
			   c = tempVar2.charAt(0);
		   }
		   if (c == '\n')
		   {
			   break;
		   }
	   }
	   if (i == 0)
	   {
		   System.out.print("No\n");
	   }
	   else
	   {
		   for (j = 1;j <= i;j++)
		   {
			   m = a[0];
			   if (m > a[j])
			   {
				   m = m;
				   n = a[j];
				   break;
			   }
			   if (m < a[j])
			   {
				   n = m;
				   m = a[j];
				   break;
			   }
			   if (m = a[j])
			   {
				   n = -1;
			   }
		   }
		   if (n == -1)
		   {
			   System.out.print("No\n");
		   }
		   else
		   {
			   for (k = j;k <= i;k++)
			   {
				   if (a[k] > m)
				   {
					   n = m;
					   m = a[k];
				   }
				   else
				   {
				   if (a[k] == m)
				   {
				   m = m;
				   n = n;
				   }
				   else
				   {
				   if (a[k] > n)
				   {
				   m = m;
				   n = a[k];
				   }
				   else
				   {
					   m = m;
					   n = n;
				   }
				   }
				   }
			   }
		   System.out.printf("%d\n",n);
		   }
	   }
	   return 0;
	}

}

