package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		int i;
		int b;
		int t;
		int x;
		int y;
		for (i = 1;i <= a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			if (b >= t)
			{
				x = t;
				t = b;
			}
			else
			{
				if (b >= x)
				{
				x = b;
				}
			}
		}
		System.out.printf("%d\n%d",t,x);
		return 0;
	}

}

