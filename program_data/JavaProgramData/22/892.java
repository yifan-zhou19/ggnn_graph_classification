package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b;
		int c;
		int d = 0;
		char e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			e = tempVar2.charAt(0);
		}
			 while (e == ',')
			 {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				e = tempVar4.charAt(0);
			}
			if (b > c)
			{
				d = c;
				c = b;
			}
			else
			{
				if (b > d && b != c)
				{
					d = b;
				}
			}
			a = a + 1;
			 }
			if (d != 0)
			{
			System.out.printf("%d",d);
			}
		else
		{
			System.out.print("No");
		}
		return 0;
	}
}

