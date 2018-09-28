package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int d;
		int ma1;
		int ma2;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			d = Integer.parseInt(tempVar);
		}
		ma1 = d;
		ma2 = d;
		c = System.in.read();
		while (c != '\n')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d = Integer.parseInt(tempVar2);
			}
			if (d > ma1)
			{
			ma2 = ma1;
			ma1 = d;
			}
			else if ((d < ma1) && (d> ma2))
			{
				ma2 = d;
			}
			else if ((d < ma2) && (ma1 == ma2))
			{
				ma2 = d;
			}

			c = System.in.read();
		}

		if (ma1 == ma2)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",ma2);
		}
		return 0;
	}
}

