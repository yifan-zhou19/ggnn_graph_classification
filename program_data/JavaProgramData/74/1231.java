package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int s = 0;
		int y;
		int z;
		y = x;
		while (x != 0)
		{
		s = 10 * s + x % 10;
		x = x / 10;
		}
		if (s == y)
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}
	public static int g(int x)
	{
		int i;
		for (i = 2;i <= x / 2;i++)
		{
		if (x % i == 0)
		{
		break;
		}
		}
		if (i == x / 2 + 1)
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
		  int i;
		  int m;
		  int n;
		  int t = 0;
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
		  for (i = m;i <= n;i++)
		  {
		  if (f(i) == 1 && g(i) == 1)
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

