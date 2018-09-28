package <missing>;

public class GlobalMembers
{
		  public static int i;
		  public static int n;
		  public static int s = 0;
	public static int zhishu(int a)
	{
		s = 0;
		if (a == 1)
		{
		return 0;
		}
		else
		{
		for (i = 2;i <= a / 2;i++)
		{
			if (a % i == 0)
			{
		s++;
			}
		}
		if (s == 0)
		{
		return 1;
		}
		else
		{
		return 0;
		}
		}
	}
	public static int Main()
	{
		  int i;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= n / 2;i++)
		  {
							 if (zhishu(i) == 1 && zhishu(n - i) == 1)
							 {
							 System.out.printf("%d %d\n",i,n - i);
							 }
		  }
		  System.in.read();
		  System.in.read();
	}
}

