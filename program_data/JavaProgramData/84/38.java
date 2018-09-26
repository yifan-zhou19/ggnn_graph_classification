package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] c = new int[100];
		int i = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = Integer.parseInt(tempVar2);
			}
		}
		int j = 2;
		int x = 0; //zuida
		int y = 0; //cida
		 if (c[0] > c[1])
		 {
			x = c[0]; //122
			y = c[1]; //57
		 }
		if (c[0] < c[1])
		{
			x = c[1];
			y = c[0];
		}

		for (j = 0;j < n;j++)
		{
			if (c[j] > x)
			{
				y = x;
				x = c[j];

			}
			if (c[j] > y && c[j] < x)
			{
				y = c[j];
			}
		}

		System.out.printf("%d\n%d\n", x,y);
		return 0;
	}





}

