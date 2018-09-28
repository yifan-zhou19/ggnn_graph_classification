package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int first;
		int second;
		int in;
		char c;
		second = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			first = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		while (c == ',')
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				in = Integer.parseInt(tempVar3);
			}
			if (in > first)
			{
				second = first;
				first = in;
			}
			else
			{
				if (in == first)
				{
					second = second;
				}
				else
				{
				if (in > second)
				{
					second = in;
				}
				}
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
		}
		if (second == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",second);
		}

	}

}

