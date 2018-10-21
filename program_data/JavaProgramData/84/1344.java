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
		if (n >= 3)
		{
			for (i = 3;i <= n;i++)
			{
			   String tempVar4 = ConsoleInput.scanfRead();
			   if (tempVar4 != null)
			   {
				   c = Integer.parseInt(tempVar4);
			   }
			   if (c >= a != 0 || c >= b)
			   {
				   if (a >= b)
				   {
					   b = c;
				   }
				   else
				   {
					   a = c;
				   }
			   }
			   else
			   {
				   continue;
			   }
			}
			if (a >= b)
			{
				System.out.printf("%d\n%d",a,b);
			}
			else
			{
				System.out.printf("%d\n%d",b,a);
			}
		}
		else
		{
			System.out.printf("%d\n%d",a,b);
		}
		return 0;
	}

}

