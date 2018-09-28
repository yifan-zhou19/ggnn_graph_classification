package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  double print = 0.0;

	  int m;
	  int n;
	  int i;
	  int k;
	  int[] arr;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }

	  for (k = 0;k < m;k++)
	  {
		print = 0.0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		arr = new int[(n + 2)];
		for (i = 0;i < n + 2;i++)
		{
		  if (i == 0 || i == 1)
		  {
			  arr[i] = 1;
		  }
		  else
		  {
			  arr[i] = arr[i - 1] + arr[i - 2];
		  }
		}
		for (i = 0;i < n;i++)
		{
		  print += (double)arr[i + 2] / arr[i + 1];
		}
		 if (k < m - 1)
		 {
		System.out.printf("%.3lf\n",print);
		 }
		 else
		 {
			System.out.printf("%.3lf",print);
		 }
	  }
	return 0;
	}
}

