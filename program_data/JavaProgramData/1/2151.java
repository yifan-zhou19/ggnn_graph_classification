package <missing>;

public class GlobalMembers
{
	public static int fenjie(int a,int b)
	{
		int c = 1;
		int i;
		for (i = b;i <= (int)Math.sqrt(a);i++)
		{
									if (a % i == 0)
									{
									c += fenjie(a / i, i);
									}
		}
		return c;
	}
	public static int Main()
	{
		  int n;
		  int i;
		  int a;
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
						   c = fenjie(a, 2);
						   System.out.printf("%d\n",c);
		  }
	}
}

