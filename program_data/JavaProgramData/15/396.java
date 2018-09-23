package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b = 0;
		int c = 0;
		int d = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n * n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a == 0)
			{
				b++;
				c++;
				d = b > d != 0?b:d;
			}
			if (a == 255)
			{
				b = 0;
			}
		}
		b = (c - 2 * d) / 2;
		System.out.printf("%d",b * (d - 2));
			 return 0;
	}

}

