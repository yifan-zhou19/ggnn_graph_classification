package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int i;
		int x = 0;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
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
			if ((a >= 90) && (a <= 140) && (b >= 60) && (b <= 90))
			{
				System.out.print("1");
			}
			else
			{
				System.out.print("0");
			}
		}
		if (n != 1)
		{
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				b = Integer.parseInt(tempVar5);
			}
			   if ((a >= 90) && (a <= 140) && (b >= 60) && (b <= 90))
			   {
				x++;
			   }
			   else
			   {
				   if (x > m)
				   {
					   m = x;
				   }
				   x = 0;
			   }
		}
		if (x > m)
		{
			m = x;
		}
		System.out.printf("%d",m);
		}
		return 0;
	}
}

