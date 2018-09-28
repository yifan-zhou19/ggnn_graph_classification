package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int c = 1;
		int i;
		for (i = 3;i <= Math.sqrt(n);i++)
		{
		if (0 == n % i)
		{
			c = 0;
		}
		}
		return (c);
	}
	public static int Main()
	{
		  int n;
		  int j;
		  int k = 1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n < 5)
		  {
		  System.out.print("empty");
		  }
		  for (j = 5;j <= n;j = j + 2)
		  {
		  if (sushu(j) == 0)
		  {
		  k++;
		  }
		  if (sushu(j - 2) == 0)
		  {
		  k++;
		  }
		  if (k == 1)
		  {
			  System.out.printf("%d %d\n",j - 2,j);
		  }
		  k = 1;
		  }
	}

}

