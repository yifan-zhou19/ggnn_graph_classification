package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int[] num = new int[300];
		int sr = 0;
		int i;
		int y;
		int r;
		char c;
	while (true)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num[sr++] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		if (c == '\n')
		{
			break;
		}
	}
	if (sr == 1)
	{
		System.out.print("No");
		return 0;
	}
	y = num[0];
	r = num[0];
	for (i = 0;i < sr;i++)
	{
		if (num[i] > y)
		{
			r = y;
			y = num[i];
		}
		else if (num[i] < y)
		{
			r = num[i];
		}

	}
	for (i = 0;i < sr;i++)
	{
		if (num[i] < y && num[i]> r)
		{
			r = num[i];
		}
	}
	 if (y == r)
	 {
		System.out.print("No");
	 }
	 else
	 {
		System.out.printf("%d",r);
	 }

	return 0;

	}
}

