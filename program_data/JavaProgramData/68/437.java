package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int num;
		int s;
		int j;
		int _s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (num = 6;num <= n;num += 2)
		{
			for (s = 3;s <= num / 2 + 1;s += 2)
			{
				for (i = 3;i <= Math.sqrt(s);i += 2)
				{
					if (s % i == 0)
					{
						break;
					}
				}
				if (i > Math.sqrt(s) && s % 2 != 0)
				{
					_s = num - s;
				for (i = 3;i <= Math.sqrt(_s);i += 2)
				{
					if (_s % i == 0)
					{
						break;
					}
				}
					if (i > Math.sqrt(_s) && s % 2 != 0)
					{
						System.out.printf("%d=%d+%d\n",num,s,_s);
						break;
					}
				}
			}
		}
	}
}

