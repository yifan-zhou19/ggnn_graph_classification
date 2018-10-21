package <missing>;

public class GlobalMembers
{
	public static int rn(int n)
	{
		if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0))
		{
		return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int day(int a,int b)
	{
		int c;
		int d;
		d = (b >= 8)?(b + 1) / 2:b / 2;
		if (b == 1)
		{
			c = 1;
		}
		if (b == 2)
		{
			c = 32;
		}
		if (rn(a) == 1)
		{
		  if (b > 2)
		  {
			  c = 61 + 31 * (d - 1) + 30 * (b - 2 - d);
		  }
		}
		if (rn(a) == 0)
		{
		  if (b > 2)
		  {
			  c = 60 + 31 * (d - 1) + 30 * (b - 2 - d);
		  }
		}
		  return (c);
	}
	public static int Main()
	{
		  int n;
		  int i;
		  int p;
		  int q;
		  int a;
		  int b;
		  int c;
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
				  a = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  b = Integer.parseInt(tempVar3);
			  }
			  String tempVar4 = ConsoleInput.scanfRead(" ");
			  if (tempVar4 != null)
			  {
				  c = Integer.parseInt(tempVar4);
			  }
			  p = day(a, b);
			  q = day(a, c);
			  if ((p - q) % 7 == 0)
			  {
			  System.out.print("YES\n");
			  }
			  else
			  {
			  System.out.print("NO\n");
			  }
		  }
		  System.in.read();
		  System.in.read();
	}

}

