package <missing>;

public class GlobalMembers
{
	public static int JudgePrime(int n)
	{
	   int k;
	   int i;
	   k = Math.sqrt(n);
	   if (n == 2)
	   {
		   return 1;
	   }
	   else
	   {
		  for (i = 2;i <= k;i++)
		  {
			  if (n % i == 0)
			  {
				  return 0;
			  }
		  }
	   }
	   return 1;
	}
	public static int JudgeOdd(int n)
	{
	   if (n % 2 == 1)
	   {
		   return 1;
	   }
	   else
	   {
		   return 0;
	   }
	}
	public static void f(int n)
	{
	   int i;
	   for (i = 2;i <= n / 2;i++)
	   {
		  if (JudgePrime(i) == 1 && JudgeOdd(i) == 1 && JudgePrime(n - i) == 1 && JudgeOdd(n - i) == 1)
		  {
		  System.out.print(i);
		  System.out.print(' ');
		  System.out.print(n - i);
		  System.out.print("\n");
		  }
	   }
	}
	public static int Main()
	{
	   int num;
	   num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   f(num);
	   return 0;
	}
}

