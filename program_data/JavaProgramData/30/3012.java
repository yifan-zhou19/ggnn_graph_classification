package <missing>;

public class GlobalMembers
{
	public static int has7(int a)
	{
		int len;
		int b;
		int p;
		int k;
		k = 0;
		len = 0;
		b = a;
		do
		{
			b = b / 10;
			len++;
		}while (b > 0);
		for (int i = len - 1;i >= 0;i--)
		{
			p = (int)(a / Math.pow(10,i));
			if (p == 7)
			{
				k = 1;
				break;
			}
			a = a - p * (int)Math.pow(10,i);
		}
		return k;
	}

	public static int Main()
	{
		int n;
		int m;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 1;m <= n;m++)
		{
			if (m % 7 != 0 && has7(m) == 0)
			{
				s = s + m * m;
			}
		}
		System.out.printf("%d",s);
		return 0;
	}

}

