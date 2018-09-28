package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int[] a = new int[300];
	   int i;
	   int j;
	   int t;
	   int n = 1;
	   int m = 0;
	   char c;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a[0] = Integer.parseInt(tempVar);
	   }
	   for (i = 1;;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead(null, 1);
		   if (tempVar2 != null)
		   {
			   c = tempVar2.charAt(0);
		   }
		   if (c == '\n')
		   {
			   break;
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a[i] = Integer.parseInt(tempVar3);
		   }
		   n += 1;
	   }
	   if (n == 1)
	   {
		   System.out.print("No\n");
	   }
	   else
	   {
		   for (i = 0;i < n - 1;i++)
		   {
		   for (j = 0;j < n - 1 - i;j++)
		   {
			   if (a[j] < a[j + 1])
			   {
				   t = a[j];
				   a[j] = a[j + 1];
				   a[j + 1] = t;
			   }
		   }
		   }
		   if (a[0] == a[n - 1])
		   {
			   System.out.print("No\n");
		   }
		   else
		   {
			   for (i = 1;;i++)
			   {
			   if (a[i] != a[0])
			   {
				   System.out.printf("%d\n",a[i]);
				   m++;
			   }
		   if (m == 1)
		   {
			   break;
		   }
			   }
		   }
	   }
	}
}

