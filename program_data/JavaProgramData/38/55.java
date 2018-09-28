package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int num;
	  double[] a = new double[1000];
	  double sum = 0;
	  double average;
	  double total = 0;
	  for (i = 0;i <= n - 1;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  num = Integer.parseInt(tempVar2);
		  }
		  sum = 0;
		  total = 0;
		  for (j = 0;j <= num - 1;j++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a + j = tempVar3;
			  }
			  sum += a[j];
		  }
		  average = sum / num;
		  for (j = 0;j <= num - 1;j++)
		  {
			  total += (a[j] - average) * (a[j] - average);
		  }
		  System.out.printf("%.5lf",Math.sqrt(total / num));
		  (i <= n - 2)?System.out.print("\n"):printf("");
	  }
	}

}

