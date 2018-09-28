package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		c = c - 2;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		while (c > 0)
		{
			   String tempVar4 = ConsoleInput.scanfRead();
			   if (tempVar4 != null)
			   {
				   a = Integer.parseInt(tempVar4);
			   }
			   if (a >= i != 0 && b >= a)
			   {
				  i = b;
				  b = a;
			   }
			   if (a <= i != 0 && b <= a)
			   {
				   i = i;
				   b = a;
			   }
			   if (a <= i != 0 && b >= i)
			   {
				   d = i;
				   i = b;
				   b = d;
			   }
			   if (a >= i != 0 && b <= i)
			   {
				   d = i;
				   i = a;
				   b = d;
			   }
			   if (a >= b != 0 && b >= i)
			   {
				   i = a;
				   b = b;
			   }
			   if (a <= b != 0 && b <= i)
			   {
				   i = i;
				   b = b;
			   }
			   c--;
		}
		System.out.printf("%d\n",i);
		System.out.printf("%d\n",b);
		return 0;
	}
}

