package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] x = new int[300];
	   int[] y = new int[300];
	   int i;
	   int j;
	   int k = 0;
	   int n;
	   int sign;
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
			  x[i] = Integer.parseInt(tempVar2);
		  }
	   }
	   for (i = 0;i < n;i++)
	   {
		  for (sign = 0,j = 0;j < i;j++)
		  {
			 if (x[i] == x[j])
			 {
				sign = 1;
				break;
			 }
		  }
		  if (sign == 0)
		  {
				y[k] = x[i];
				k++;
		  }

	   }
	   System.out.printf("%d",y[0]);
	   for (i = 1;i < k;i++)
	   {
		  System.out.printf(",%d",y[i]);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   n = Integer.parseInt(tempVar3);
	   }
	   return 0;
	}

}

