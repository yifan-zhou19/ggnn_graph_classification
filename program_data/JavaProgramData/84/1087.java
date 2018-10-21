package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = 0;
		c = 0;
		while (i <= n)
		{
				   String tempVar2 = ConsoleInput.scanfRead();
				   if (tempVar2 != null)
				   {
					   a = Integer.parseInt(tempVar2);
				   }
				   if (a > b)
				   {
						  if (c < b)
						  {
								 c = b;
						  }
						  b = a;
				   }
				   else
				   {
					   if (c < a)
					   {
							  c = a;
					   }
				   }
				   i++;

		}
		System.out.printf("%d\n",b);
		System.out.printf("%d\n",c);
		return 0;

	}
}

