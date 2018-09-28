package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b = -1;
		int c = -2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		int d;
		for (int i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d = Integer.parseInt(tempVar2);
			}
			if (d > b)
			{
				c = b;
				b = d;
			}
			else if (d < b && d> c)
			{
				c = d;
			}
		}
		System.out.printf("%d\n%d",b,c);
		return 0;
	}
}

