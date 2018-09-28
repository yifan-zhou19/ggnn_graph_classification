package <missing>;

public class GlobalMembers
{
	public static int isPrime(int n)
	{
	   int sum = 0;
	   for (int i = 2;i < n;i++)
	   {
		   if (n % i == 0)
		   {
			  return 0;
			  sum++;
			  break;
		   }
	   }
	   if (sum == 0)
	   {
		   return 1;
	   }
	   else
	   {
		   return 0;
	   }
	}
	public static int Main()
	{
	  int n;
	  int x;
	  int flag = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (x = 3;x < n - 1;x += 2)
	  {
		if (isPrime(x) != 0 && isPrime(x + 2) != 0)
		{
			System.out.printf("%d %d\n",x,x + 2);
			flag++;
		}
	  }
	  if (flag == 0)
	  {
		  System.out.print("empty\n");
	  }
	  return 0;
	}
}

