package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int h;
		int hengsum = 0;
		int js = 1;
		int spj;
		int susum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			spj = 1;
			if (hengsum == 0)
			{
				js = i;
			}
			for (k = 1;k <= n;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					h = Integer.parseInt(tempVar2);
				}
				if (h == 0)
				{
					if (spj == 1)
					{
						susum += 1;
						spj++;
					}

					if (js == i)
					{
						hengsum += 1;
					}
				}

			}
		}
		System.out.printf("%d",(susum - 2) * (hengsum - 2));
		return 0;
	}
}

