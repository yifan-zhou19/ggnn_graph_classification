package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		int n;
		int i;
		int k;
		int max;
		int[] x = new int[100];
		int[] y = new int[100];
		int[] biaoji = new int[100];
		int[] jilu = new int[100];
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
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  y[i] = Integer.parseInt(tempVar3);
		  }
		  if (x[i] < 141 && x[i]>89 && y[i] < 91 && y[i]>59)
		  {
			biaoji[i] = 1;
		  }
		  else
		  {
			biaoji[i] = 0;
		  }
		}
		if (n > 1)
		{
		  for (i = 0;i < 100;i++)
		  {
		  jilu[i] = 0;
		  }
		  k = 1;
		  for (i = 0;i < n - 1;i++)
		  {
		   if (biaoji[i] == 1)
		   {
			  if (biaoji[i + 1] == 1)
			  {
				k++;
				jilu[i] = k;
			  }
			  else
			  {
				k = 1;
				jilu[i] = 1;
			  }
		   }
		   else
		   {
			  jilu[i] = 0;
			  k = 1;
		   }
		  }
		  max = jilu[0];
		  for (i = 1;i < n;i++)
		  {
			if (max < jilu[i])
			{
				max = jilu[i];
			}
		  }
		  System.out.printf("%d",max);
		}
		  else
		  {
		   System.out.printf("%d",biaoji[0]);
		  }
	  return 0;
	 }

}

