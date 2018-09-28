package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b = -1;
		int c;
		int r;
		char e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			e = tempVar2.charAt(0);
		}
		r = a;
		if (e == 10)
		{
			System.out.print("No");
		}
		else
		{
			while (e == 44)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					c = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(null, 1);
				if (tempVar4 != null)
				{
					e = tempVar4.charAt(0);
				}
				if (c > b && c < a)
				{
					b = c;
				}
				else if (c > a)
				{
					b = a;
					a = c;
				}
			}
			if (a == r && b == r || b == -1)
			{
				System.out.print("No");
			}
			else
			{
				System.out.printf("%d", b);
			}
		}
	}
}

