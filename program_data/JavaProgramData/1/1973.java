package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int[] num = new int[100];
	  int n;
	  int m;
	  int fj = new int(int,int);
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
		   num[i] = Integer.parseInt(tempVar2);
	   }
	  }
	  for (i = 1;i <= n;i++)
	  {
	   System.out.printf("%d\n",fj(2, num[i]));
	  }

	  return 0;
	}

	 public static int fj(int k,int n)
	 {
	  int c;
	  int i;
	  int sum = 1;
	  if (n == 2)
	  {
		  return (sum);
	  }
	  else if (n == 3)
	  {
		  return (sum);
	  }
	  else
	  {
		 c = (int)Math.sqrt(n);
		 for (i = k;i <= c;i++)
		 {
			if (n % i == 0)
			{
				sum = sum + fj(i, n / i);
			}
		 }
		 return (sum);
	  }
	 }

}

