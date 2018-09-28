package <missing>;

public class GlobalMembers
{
	public static int F(int a,int b)
	{
		if (a == 1 || a == 0)
		{
			return 1;
		}
		if (a < 0)
		{
			return 0;
		}
		else if (b == 1)
		{
			return 1;
		}
		else
		{
			return F(a, b - 1) + F(a - b, b);
		}
	}
	public static int Main()
	{
		  int i;
		  int t;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < t;i++)
		  {
				  int m;
				  int n;
				  int k;
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
				  k = F(m, n);
				  System.out.printf("%d\n",k);
		  }

	}

}

