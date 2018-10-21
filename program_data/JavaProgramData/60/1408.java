package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int i;
	   double a;
	  if (n == 1 || n == 2)
	  {
	  return 0;
	  }
	  else
	  {
		  a = Math.sqrt(n);
		  for (i = 2;i <= a;i++)
		  {
			  if (n % i == 0)
			  {
			  return 0;
			  }
		  }
			  return 1;
	  }
	}

	public static int Main()
	{

		  int n;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n < 5)
		  {
		  System.out.print("empty\n");
		  }
		  else
		  {
			  for (i = 1;i <= (n - 2);i++)
			  {
			  if (sushu(i) == 1 && sushu(i + 2) == 1)
			  {
			  System.out.printf("%d %d\n",i,i + 2);
			  }
			  }
		  }
		  return 0;
	}

}

