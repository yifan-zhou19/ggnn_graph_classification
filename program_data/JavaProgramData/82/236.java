package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int x;
		int i;
		int b;
		int a = 0;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= x;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			if ((m >= 90) && (m <= 140) && (n >= 60) && (n <= 90))
			{
				a++;
			b = a;
			}
			else
			{
				a = a;
			b = a;
			if (b != 0)
			{
				break;
			}
			}
		}
		int y = i;
		for (i = y;i < x;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				n = Integer.parseInt(tempVar5);
			}
			if ((m >= 90) && (m <= 140) && (n >= 60) && (n <= 90))
			{
				c++;
			}
			else
			{
				c = 0;
			}
			if (c > b)
			{
				b = c;
			}
		}
		System.out.printf("%d",b);
		return 0;
	}
}

