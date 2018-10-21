package <missing>;

public class GlobalMembers
{
	 public static void Main()
	 {
		 int i;
		 int j;
		 int n;
		 int[] x = new int[500];
		 int temp;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  j = 0;
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
		  if (x[i] % 2 == 1)
		  {
			  x[j] = x[i];
		   j++;
		  }
	  }
	  n = j;
	  for (i = 0;i < n;i++)
	  {
			  for (j = 0;j < n - i - 1;j++)
			  {
				 if (x[j] > x[j + 1])
				 {
					 temp = x[j + 1];
				  x[j + 1] = x[j];
				  x[j] = temp;
				 }
			  }
	  }
	  for (i = 0;i < n;i++)
	  {
			  if (i == 0)
			  {
			  System.out.printf("%d", x[i]);
			  }
		  else
		  {
			  System.out.printf(",%d", x[i]);
		  }
	  }
	 }
}

