package <missing>;

public class GlobalMembers
{
	public static int fanxu(int x)
	{
		int sum = 0;
		int i;
		int[] f = new int[10];
		int a = 10;
		int p;
		int q;
		for (i = 0;i < 10;i++)
		{
			f[i] = (x % a) / (a / 10);
			x = x - (a / 10) * f[i];
			if (x == 0)
			{
				break;
			}
			a *= 10;
		}
		q = 1;
		for (p = 0;p <= i;p++)
		{
			sum += f[i - p] * q;
			q *= 10;
		}
		return sum;
	}
	public static int Main()
	{
		int i;
		int[] k = new int[6];
		int shu;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				shu = Integer.parseInt(tempVar);
			}
			if (shu == 0)
			{
				k[i] = 0;
			}
			if (shu < 0)
			{
				k[i] = -1 * fanxu(Math.abs(shu));
			}
			else
			{
				k[i] = fanxu(shu);
			}
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",k[i]);
		}
		return 0;
	}

}

