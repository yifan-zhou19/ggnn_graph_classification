package <missing>;

public class GlobalMembers
{
	public static int panduan(int m,int k,int s)
	{
		int i = 1;

		if ((m - k) % s == 0)
		{
			while (i <= s)
			{
				m = (m - k) * (s - 1) / s;
				if ((m - k) % s == 0)
				{
					i++;
				}
				else if ((m - k) % s != 0)
				{
					break;
				}
			}
			if (i == s)
			{
				return (1);
			}
			else
			{
				return (0);
			}
		}
		else
		{
			return (0);
		}
	}

	public static void Main()
	{
		int i;
		int s;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = s;;)
		{
			if (panduan(i, k, s) != 0)
			{
				System.out.printf("%d\n",i);
				break;
			}
			else
			{
				i = i + 1;
			}
		}
	}
}

