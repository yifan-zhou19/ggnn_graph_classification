package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int sum;
	int x;
	int[] a = new int[100];
	int[] b = new int[100];

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }

	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   sum = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   x = Integer.parseInt(tempVar3);
	   }

	   for (i = 0;i < n - 1;i++)
	   {

		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  a[i] = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead();
		  if (tempVar5 != null)
		  {
			  b[i] = Integer.parseInt(tempVar5);
		  }

		  if ((x * 0.1 * 10 / sum - b[i] * 0.1 * 10 / a[i]) > 0.05)
		  {

		  System.out.print("worse\n");
		  }

		  else if ((b[i] * 0.1 * 10 / a[i] - x * 0.1 * 10 / sum) > 0.05)
		  {

		  System.out.print("better\n");
		  }

		  else
		  {
			  System.out.print("same\n");
		  }


	   }

	return 0;
	}
}

