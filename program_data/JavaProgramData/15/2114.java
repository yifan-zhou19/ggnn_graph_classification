package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int left0;
		int right0;
		int left1;
		int right1;
		left0 = -1;
		right0 = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					k = Integer.parseInt(tempVar2);
				}
				if ((k == 0) && (left0 == -1) && (right0 == -1))
				{
					left0 = i;
					right0 = j;
				}
				if (k == 0)
				{
					left1 = i;
					right1 = j;
				}
			}
		}
		int t = 0;
		if (((left1 - left0) > 1) && ((right1 - right0) > 1))
		{
			m = (left1 - left0 - 1) * (right1 - right0 - 1);
			System.out.printf("%d\n",m);
		}
		else
		{
			System.out.printf("%d\n",t);
		}
		return 0;
	}
}

