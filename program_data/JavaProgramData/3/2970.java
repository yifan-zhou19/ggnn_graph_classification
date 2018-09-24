package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int k;
	   int[] x = new int[1000];
	   int i;
	   int j;
	   int sign = 0;

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   k = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i < n;i++)
	   {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  x[i] = Integer.parseInt(tempVar3);
		  }
	   }

	   for (i = 0;i < n;i++)
	   {

		   for (j = i + 1;j < n;j++)
		   {
			   if ((x[i] + x[j]) == k)
			   {
				   sign = 1;
				   break;
			   }
		   }

	   }

	   if (sign == 1)
	   {
		   System.out.print("yes");
	   }
	   else
	   {
		   System.out.print("no");
	   }

		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			k = Integer.parseInt(tempVar5);
		}
	   return 0;
	}

}

