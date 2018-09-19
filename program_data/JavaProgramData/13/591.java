package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int[] a = new int[20000];
	   int n;
	   int i;
	   int j;
	   int t;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (j = 0;j < n;j++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[j] = Integer.parseInt(tempVar2);
		   }
	   }
	   System.out.printf("%d",a[0]);
	   for (j = 1;j < n;j++)

	   {
		   t = 0;
		   for (i = 0;i < j;i++)
		   {
			   if (a[i] == a[j])
			   {
				   t = t + 1;
			   }
			   else
			   {
				   ;
			   }
		   }
		   if (t == 0)
		   {
			   System.out.printf(" %d",a[j]);
		   }
			  else
			  {
				  ;
			  }
	   }

	}

}

