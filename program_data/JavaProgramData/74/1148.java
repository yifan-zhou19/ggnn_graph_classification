package <missing>;

public class GlobalMembers
{
	public static int tp(int x)
	{
	 int i;
	 int k;
	 k = Math.sqrt(x);
	 for (i = 2;i <= k;i++)
	 {
					 if (x % i == 0)
					 {
						 break;
					 }
	 }
	 if (i == k + 1)
	 {
	 return 1;
	 }
	 else
	 {
		 return 0;
	 }
	}

	public static int th(int x)
	{
	  int a;
	  int b;
	  int c;
	  b = 0;
	  c = x;
	  while (x != 0)
	  {
				 a = x % 10;
				 b = b * 10 + a;
				 x = x / 10;
	  }
	  if (c == b)
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
		  int m;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }
		  int i;
		  int t = 0;
		  for (i = m;i <= n;i++)
		  {
							  if (tp(i) == 1 && th(i) == 1)
							  {
										  if (t == 0)
										  {
												  System.out.printf("%d",i);
												  t++;
										  }
										  else
										  {
										  System.out.printf(",%d",i);
										  }
							  }
		  }
		  if (t == 0)
		  {
		  System.out.print("no");
		  }
		  System.in.read();
		  System.in.read();
	}
}

