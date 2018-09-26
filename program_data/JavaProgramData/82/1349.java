package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int c;
		int d;
		int[][] s = new int[110][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i][1] = Integer.parseInt(tempVar3);
			}
		}
		if (s[0][0] >= 90 && s[0][0] <= 140 && s[0][1] >= 60 && s[0][1] <= 90)
		{
			c = 1;
		}
		else
		{
			c = 0;
		}
		d = c;
		for (i = 1;i < n;i++)
		{
			if (s[i][0] >= 90 && s[i][0] <= 140 && s[i][1] >= 60 && s[i][1] <= 90)
			{
				c = c + 1;
			}
			else
			{
				c = 0;
			}
			if (c > d)
			{
				d = c;
			}
		}
		System.out.printf("%d",d);
			return 0;
	}
}

