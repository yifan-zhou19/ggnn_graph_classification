package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		c = 1;
		while (c == 1)
		{
			if (a > b)
			{
				a = a / 2;
			}
			if (a < b)
			{
				b = b / 2;
			}
			if (a == b)
			{
				c = 0;
				System.out.printf("%d",a);
			}
		}
	}


}

