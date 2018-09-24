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
	  if (n >= 10000)
	  {
	  a = n / 10000;
	  b = (n - 10000 * a) / 1000;
	  c = (n - 10000 * a - 1000 * b) / 100;
	  d = (n - 10000 * a - 1000 * b - 100 * c) / 10;
	  e = n - 10000 * a - 1000 * b - 100 * c - 10 * d;
	  f = 10000 * e+1000 * d + 100 * c + 10 * b + a;
	  }
	  else if (n >= 1000)
	  {
	  a = n / 1000;
	  b = (n - 1000 * a) / 100;
	  c = (n - 1000 * a - 100 * b) / 10;
	  d = (n - 1000 * a - 100 * b - 10 * c) / 1;
	  f = 1000 * d + 100 * c + 10 * b + a;
	  }
	  else if (n >= 100)
	  {
	  a = n / 100;
	  b = (n - 100 * a) / 10;
	  c = (n - 100 * a - 10 * b) / 1;
	  f = 100 * c + 10 * b + a;
	  }
	  else if (n >= 10)
	  {
	  a = n / 10;
	  b = (n - 10 * a) / 1;
	  f = 10 * b + a;
	  }
	  else
	  {
		  f = n;
	  }
	  System.out.printf("%d",f);
	}
}

