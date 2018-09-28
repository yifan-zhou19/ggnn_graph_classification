package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int k;
	  int sum = 0;
	  int a;
	  int b;
	  int max = 0;
	  int i;
	  int result = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b = Integer.parseInt(tempVar3);
		  }
		  if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
		  {
					 sum++;
		  }
					 else
					 {
						  if (sum > max)
						  {
							  max = sum;
						  }
						  sum = 0;
					 }
	  }
	if (sum > max)
	{
		max = sum;
	}
	 System.out.printf("%d",max);
	  return 0;
	}

}

