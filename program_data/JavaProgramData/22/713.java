package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b = 0;
		int c;
		char d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (;;)
		{
			d = System.in.read();
			if (d != ',')
			{
				break;
			}
			else
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					c = Integer.parseInt(tempVar2);
				}
				if (c > a)
				{
					b = a;
					a = c;
				}
				else if (c < a && c> b)
				{
					b = c;
				}
				else
				{
					continue;
				}
			}
		}
		if (b == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",b);
		}
	return 0;
	}



}

