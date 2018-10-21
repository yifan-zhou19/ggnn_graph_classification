package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] a = new int[100];
	   int[] bre = new int[100];
	   int i;
	   int j;
	   int k;
	   int l;
	   int n;
	   int m;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   while (n-- != 0)
	   {
		   for (i = 1;i <= 60;i++)
		   {
			   a[i] = 1;
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   m = Integer.parseInt(tempVar2);
		   }
		   if (m == 0)
		   {
			   System.out.print("60\n");
			   continue;
		   }
		   else
		   {
			   for (i = 1;i <= m;i++)
			   {
				   String tempVar3 = ConsoleInput.scanfRead();
				   if (tempVar3 != null)
				   {
					   bre[i] = Integer.parseInt(tempVar3);
				   }
			   }
			   for (i = 1;i <= m;i++)
			   {
				   bre[i] = bre[i] + 3 * (i - 1);
			   }
			   for (i = 1;i <= m;i++)
			   {
				   a[bre[i] + 1] = 0;
				   a[bre[i] + 2] = 0;
				   a[bre[i] + 3] = 0;
			   }
			   l = 0;
			  for (i = 1;i <= 60;i++)
			  {
				l = l + a[i];
			  }
			  System.out.printf("%d\n",l);
		   }
	   }
	   return 0;
	}



}

