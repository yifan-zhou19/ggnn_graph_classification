package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		while (n - 2 != 0)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
		if (b > a)
		{
			if (a > c)
			{
				i = b;
				b = a;
				a = i;
			}
				  else
				  {
					  if (b > c)
					  {
						  a = b;
						  b = c;
					  }
					   else
					   {
						   a = c;
					   }
				  }
		}
		else
		{
			if (b < c)
			{
				if (a < c)
				{
					b = a;
					a = c;
				}
					   else
					   {
						   b = c;
					   }
			}
		}
			 n = n - 1;
		}
		System.out.printf("%d\n",a);
		System.out.printf("%d",b);
		return 0;
	}

}

