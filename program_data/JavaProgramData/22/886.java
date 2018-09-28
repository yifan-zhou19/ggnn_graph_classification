package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int max1;
		int max2;
		int t;
		int x;
		int j;
		char c;
		x = -999;
		j = 0;
		max1 = max2 = 0;
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				t = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (t == x)
			{
				j = j + 1;
			}
			if (t > max1)
			{
				max2 = max1;
				max1 = t;
			}
			else if (t < max1 && t> max2)
			{
				max2 = t;
			}
			x = t;
			if (c == '\n')
			{
				break;
			}
		}
		if (i <= 1)
		{
			System.out.print("No");
		}
		else if (i == j)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",max2);
		}
		return 0;
	}
}

