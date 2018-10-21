package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int func = int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  while (n != 1)
	  {
		n = func(n);
	  }
	  System.out.print("End\n");
	}
	public static int func(int n)
	{
	  if (n % 2 == 1)
	  {
		 System.out.printf("%d*3+1=%d\n",n,3 * n + 1);
		 n = 3 * n + 1;
	  }
	  else
	  {
		  System.out.printf("%d/2=%d\n",n,n / 2);
		  n = n / 2;
	  }
	  return (n);
	}
}

