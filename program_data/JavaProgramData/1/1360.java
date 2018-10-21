package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static int k = 2;
	public static int fenjie(int n,int k)
	{
	  int x;
	  int i;
	  int sum = 0;
	  int p = 0;
	  x = (int)Math.pow(n,0.5);
	  for (i = k;i <= x;i++)
	  {
		 if (n % i == 0)
		 {
			 k = i;
			 sum = sum + fenjie(n / i, k);
			 p = 1;
		 }
	  }
	   if (p == 0)
	   {
		   return 1;
	   }
	   if (p == 1)
	   {
		   return sum + 1;
	   }
	}
	 public static int Main()
	 {
		 int m;
		 int n;
		 int i;
		 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 0;i <= m - 1;i++)
		 {
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   System.out.print(fenjie(n, 2));
		   System.out.print("\n");
			sum = 0;
		 }

	  return 0;
	 }

}

