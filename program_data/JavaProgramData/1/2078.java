package <missing>;

public class GlobalMembers
{
	public static int shi(int a)
	{
		  int b = Math.sqrt(a);
		  for (int i = 2;i <= b;i++)
		  {
			   if (a % i == 0)
			   {
				   return 0;
			   }
		  }
		  return 1;
	}
	public static int shu(int m,int k)
	{
		  int a = 1;
		  for (int j = k;j <= Math.sqrt(m);j++)
		  {
				if (m % j == 0 && m / j >= k)
				{
					 a++;
					 if (shi(m / j) == 0)
					 {
						 a += shu(m / j, j) - 1;
					 }
				}
		  }
		 return a;
	}
	public static int Main()
	{
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (int i = 1;i <= n;i++)
	  {
		 int m;
		 int a;
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 m = Integer.parseInt(tempVar2);
		 }
		 System.out.printf("%d\n",shu(m, 2));
	  }
	return 0;
	}
}

