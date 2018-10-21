package <missing>;

public class GlobalMembers
{
	// state: 0( left up ), 1( right down)
	public static int Main()
	{
		int state = 0;
		int n;
		int t;
		int i;
		int j;
		int m;
		int m1;
		int m2;
		int leftx;
		int lefty;
		int rightx;
		int righty;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					t = Integer.parseInt(tempVar2);
				}
				if (t == 0)
				{
					if (state == 0)
					{
						leftx = i;
						lefty = j;
						state = 1;
					}
					else
					{
						rightx = i;
						righty = j;
					}
				}
			}
		}
		m1 = (rightx - leftx - 1);
		m2 = (righty - lefty - 1);
		m = m1 * m2;
		System.out.printf("%d", m);
		return 0;

	}
}

