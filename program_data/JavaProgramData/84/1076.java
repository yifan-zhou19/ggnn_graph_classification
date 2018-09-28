package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a;
		int i;
		int b;
		int c;
		int d;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		for (i = 1;i <= n - 2;i++)
		{
						  String tempVar4 = ConsoleInput.scanfRead();
						  if (tempVar4 != null)
						  {
							  b = Integer.parseInt(tempVar4);
						  }
						  if (b > a && a > c)
						  {
									c = a;
									a = b;
						  }
						  if (b > c && c > a)
						  {
										 a = b;
										 c = c;
						  }
						  if (a > b && b > c)
						  {
										 a = a;
										 c = b;
						  }
						  if (a > c && c > b)
						  {
										 a = a;
										 c = c;
						  }
						  if (c > a && a > b)
						  {
									   d = c;
									   c = a;
									   a = d;
						  }
						  if (c > b && b > a)
						  {
										 a = c;
										 c = b;
						  }
		}
		System.out.printf("%d\n%d",a,c);
		return 0;
	}
}

