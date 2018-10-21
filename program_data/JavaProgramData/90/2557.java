package <missing>;

public class GlobalMembers
{
	public static int fang(int a,int b)
	{
		int m;
		if (b == 1 || a == 0)
		{
			m = 1;
		}
		else
		{
			if (a >= b)
			{
				m = fang(a - b, b) + fang(a, b - 1);
			}
			if (a < b)
			{
				m = fang(a, b - 1);
			}
		}
		return m;
	}
	public static int Main()
	{
		  int i;
		  int p;
		  int q;
		  int a;
		  int n;
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
				  p = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  q = Integer.parseInt(tempVar3);
			  }
			  a = fang(p, q);
			  System.out.printf("%d\n",a);
		  }
	}
}

