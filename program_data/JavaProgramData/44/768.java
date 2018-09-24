package <missing>;

public class GlobalMembers
{
	public static int reverse(int a)
	{
		int k;
		int p = 0;
		int m = 0;
		if (a < 0)
		{
			m = -a;
			while (m > 0)
			{
				k = m % 10;
				p = p * 10 + k;
				m = m / 10;
			}
			p = -p;
		}
		else if (a > 0)
		{
			m = a;
			while (m > 0)
			{
				k = m % 10;
				p = p * 10 + k;
				m = m / 10;
			}
		}
		else if (a == 0)
		{
		  p = 0;
		}
		return p;
	}
	public static int Main()
	{
		int reverse = int a;
		int i;
		int[] b = new int[6];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				b[i] = Integer.parseInt(tempVar);
			}
			b[i] = reverse(b[i]);
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;
	}






}

