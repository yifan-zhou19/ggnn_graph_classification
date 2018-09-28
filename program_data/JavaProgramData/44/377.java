package <missing>;

public class GlobalMembers
{
	public static int reverse(int x)
	{
		int j;
		int p;
		p = x;
		int q;
		for (j = 0;;j++)
		{
			p = p / 10;
			if (p == 0)
			{
				q = j;
				break;
			}
		}
		p = 0;
		for (j = 0;j < q + 1;j++)
		{
			p += (x % 10) * Math.pow(10,q - j);
			x = x / 10;
		}
		return p;
	}

	public static int Main()
	{
		int i;
		int m;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m = Integer.parseInt(tempVar);
			}
			m = reverse(m);
			System.out.printf("%d\n",m);
		}
		return 0;
	}

}

