package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int m;
		int i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			if (i == 1)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Integer.parseInt(tempVar2);
				}
			}
			if (i == 2)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			  if (b > a)
			  {
				  m = a;
				  a = b;
				  b = m;
			  }
			}
			if (i != 1 && i != 2)
			{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			  if (c > a)
			  {
				  b = a;
				  a = c;
			  }
			  if (c < a && c> b)
			  {
				  b = c;
			  }
			}
		i++;


		}
	System.out.printf("%d\n%d\n",a,b);

	return 0;
	}
}

