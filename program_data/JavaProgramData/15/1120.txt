package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a1;
		int b1;
		int a2;
		int b2;
		int n;
		int t;
		int area;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					t = Integer.parseInt(tempVar2);
				}
				if (t == 0)
				{
					if (s == 0)
					{
						a1 = i;
						b1 = j;
						s = 1;
					}
					a2 = i;
					b2 = j;
				}
			}
		}

		area = (a2 - a1 - 1) * (b2 - b1 - 1);
		System.out.printf("%d", area);
		return 0;
	}

}

