package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int i;
	  int t;
	  int m;
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  t = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i <= t - 1;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  n = Integer.parseInt(tempVar3);
		  }
		  System.out.printf("%d",f(m, n));
		  if (i != t - 1)
		  {
			  System.out.print("\n");
		  }
	  }

	}

	public static int f(int m,int n)
	{
		 int x = 0;
		 if (m < 0)
		 {
			 x += 0;
		 }
		 else if (m == 0)
		 {
			 x += 1;
		 }
		 else if (n > 1)
		 {
			 x += f(m, n - 1) + f(m - n, n);
		 }
		 else if (n == 1)
		 {
			 x += 1;
		 }
		 return x;
	}

}

