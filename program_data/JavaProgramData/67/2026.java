package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int m;
		  int n;
		  int g;
		  double k;
		  double k1;
		  double k2;
		  double temp;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  i = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  j = Integer.parseInt(tempVar3);
		  }
		  k = 1.0 * j / i;
		  k1 = k + 0.05;
		  k2 = k - 0.05;
		  for (g = 1;g < n;g++)
		  {
						  String tempVar4 = ConsoleInput.scanfRead();
						  if (tempVar4 != null)
						  {
							  i = Integer.parseInt(tempVar4);
						  }
						  String tempVar5 = ConsoleInput.scanfRead(" ");
						  if (tempVar5 != null)
						  {
							  j = Integer.parseInt(tempVar5);
						  }
						  temp = 1.0 * j / i;
						  if (temp < k2)
						  {
							  System.out.print("worse\n");
						  }
						  else if (temp > k1)
						  {
							  System.out.print("better\n");
						  }
						  else
						  {
							  System.out.print("same\n");
						  }
		  }

	}

}

