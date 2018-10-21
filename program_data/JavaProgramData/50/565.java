package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] d = new int[100];
		int y;
		int a;
		int w;
			int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
			if (i == 1)
			{
				d[1] = 12;
			}
			if (i >= 2)
			{
				d[i] = d[i - 1] + m[i - 2];
			}
		}
			for (i = 1;i <= 12;i++)
			{
				y = w - 5;
				a = (d[i] + y) % 7;
				if (a == 0)
				{
					System.out.printf("%d\n",i);
				}
			}
			return 0;
	}
}

