package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int y;
		int s;
		int z;
		int x;
		int a;
		int b;
		int c;
		int ax;
		int bx;
		int cx;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = 0;
		b = 0;
		c = 0;
		ax = 0;
		bx = 0;
		cx = 0;
		for (i = 1;i <= n;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				s = Integer.parseInt(tempVar4);
			}
			z = y + s;
			if (c >= z)
			{
				continue;
			}
			else if (b >= z)
			{
				c = z;
				cx = x;
			}
			else if (a >= z)
			{
				c = b;
				cx = bx;
				b = z;
				bx = x;
			}
			else
			{
				c = b;
				cx = bx;
				b = a;
				bx = ax;
				a = z;
				ax = x;
			}
		}
		System.out.printf("%d %d\n",ax,a);
		System.out.printf("%d %d\n",bx,b);
		System.out.printf("%d %d\n",cx,c);
	}

}

