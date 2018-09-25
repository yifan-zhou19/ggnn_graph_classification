package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int i = 1;
		int h = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			i = i + 1;
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
			{
				h = h + 1;
				if (h >= t)
				{
					t = h;
				}
			}
			else if (h >= t)
			{
				t = h;
				h = 0;
			}
			else
			{
				t = t;
				h = 0;
			}
		}
		System.out.printf("%d",t);
		return 0;
	}

}

