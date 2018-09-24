package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
	   int[] c = new int[300];

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int i;
	  int sum = 0;
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  c[i] = Integer.parseInt(tempVar2);
		  }
	  sum += c[i];


	  }
	  double b;
	  b = (double)sum / n;
	  double largest = 0;
	  double[] d = new double[300];
	  for (i = 0;i < n;i++)
	  {
	  if (c[i] > b)
	  {
	  d[i] = (double)c[i] - b;
	  }
	  else
	  {
	   d[i] = b - (double)c[i];
	  }
	  if (d[i] > largest)
	  {
		  largest = d[i];
	  }
	  }

	  int j;
	  int e;
	  double m;
	  for (i = 0;i < n;i++)
	  {
		  for (j = n - 1;j > i;j--)
		  {
			  if (c[j] < c[j - 1])
			  {
				  e = c[j - 1];
			 c[j - 1] = c[j];
			 c[j] = e;
			 m = d[j - 1];
			 d[j - 1] = d[j];
			 d[j] = m;

			  }




		  }

	  }


	  for (i = 0;i < n;i++)
	  {
		 if (d[i] == largest)
		 {
			 System.out.printf("%d",c[i]);
		 d[i] = 0;
		 break;
		 }



	  }
	  for (i = 0;i < n;i++)
	  {
		 if (d[i] == largest)
		 {
			 System.out.printf(",%d",c[i]);
		 }



	  }




	   return 0;


	}


}

