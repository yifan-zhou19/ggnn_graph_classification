package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		char c = ',';
		a = -1;
		b = 1;
		while (c == ',')
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				i = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (i > a)
			{
				b = a;
				a = i;
			}
			else if ((i < a) && (i> b))
			{
				b = i;
			}
		}
		if (b == -1)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",b);
		}
		return 0;
	}
}

