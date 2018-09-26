package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int first = 1;
	  int sum;
	  int n;
	  int k;
	  int i = 2;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  k = Integer.parseInt(tempVar2);
	  }
	  sum = first * n + k;
	  while (i <= n)
	  {
		  if (sum % (n - 1) != 0)
		  {
			  i = 2;
			  first++;
			  sum = first * n + k;
			  continue;
		  }
		  sum = sum / (n - 1) * n + k;
		  i++;
	  }
	  System.out.printf("%d\n",sum);
	}
}

