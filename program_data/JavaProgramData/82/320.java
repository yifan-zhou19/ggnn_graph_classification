package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = 0;
		y = 0;
		i = 1;
		while (i <= n)
		{
				   String tempVar2 = ConsoleInput.scanfRead();
				   if (tempVar2 != null)
				   {
					   a = Integer.parseInt(tempVar2);
				   }
				   String tempVar3 = ConsoleInput.scanfRead(" ");
				   if (tempVar3 != null)
				   {
					   b = Integer.parseInt(tempVar3);
				   }
				   if (a <= 140 && a >= 90 && b <= 90 && b >= 60)
				   {
				   x = x + 1;
				   if (y < x)
				   {
						  y = x;
				   }
				   }
				   else
				   {
					   x = 0;
				   }
				   i++;
		}
		System.out.printf("%d",y);
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		return 0;

	}
}

