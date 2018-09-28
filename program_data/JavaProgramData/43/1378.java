package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
			  int i;
			  int b;
			  b = (int)Math.sqrt(a);
			  for (i = 2;i <= b;i++)
			  {
							   if (a % i == 0)
							   {
							   break;
							   }
			  }
			  if (i == b + 1)
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
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i++)
		{
			if (sushu(i) == 1 && sushu(m - i) == 1)
			{
										  System.out.printf("%d %d\n",i,(m - i));
			}
		}
		System.in.read();
		System.in.read();
	}

}

