package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int a;
	  int b;
	  int c;
	  int d;
	  int e;
	  int f;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  if (n >= 100)
	  {
	  a = (int)n / 100;
	  }
	  else
	  {
	  a = 0;
	  }
	  if (n % 100 >= 50)
	  {
	  b = (int)(n % 100) / 50;
	  }
	  else
	  {
	  b = 0;
	  }
	  if (n % 50 >= 20)
	  {
	  c = (int)(n % 50) / 20;
	  }
	  else
	  {
	  c = 0;
	  }
	  if ((n % 50) % 20 >= 10)
	  {
	  d = ((n % 50) % 20) / 10;
	  }
	  else
	  {
	  d = 0;
	  }
	  if (n % 10 >= 5)
	  {
	  e = (n % 10) / 5;
	  }
	  else
	  {
	  e = 0;
	  }
	  f = n % 5;
	 System.out.printf("%d\n",a);
	  System.out.printf("%d\n",b);
	  System.out.printf("%d\n",c);
	  System.out.printf("%d\n",d);
	  System.out.printf("%d\n",e);
	  System.out.printf("%d\n",f);

	  return 0;
	}
}

