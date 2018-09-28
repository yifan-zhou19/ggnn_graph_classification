package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int[] A = new int[6];
		int FanXu = int x;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				A[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			A[i] = FanXu(A[i]);
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",A[i]);
		}
	}

	public static int FanXu(int x)
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int fanxu;
		if (x >= 0)
		{
			a = x / 10000;
			b = (x - a * 10000) / 1000;
			c = (x - a * 10000 - b * 1000) / 100;
			d = (x - a * 10000 - b * 1000 - c * 100) / 10;
			e = (x - a * 10000 - b * 1000 - c * 100 - d * 10);
			if (a != 0)
			{
				fanxu = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
			}
			else if (b != 0)
			{
				fanxu = e * 1000 + d * 100 + c * 10 + b;
			}
			else if (c != 0)
			{
				fanxu = e * 100 + d * 10 + c;
			}
			else if (d != 0)
			{
				fanxu = e * 10 + d;
			}
			else if (e != 0)
			{
				fanxu = e;
			}
			else
			{
				fanxu = 0;
			}
			return (fanxu);
		}
		else
		{
			x = -x;
			a = x / 10000;
			b = (x - a * 10000) / 1000;
			c = (x - a * 10000 - b * 1000) / 100;
			d = (x - a * 10000 - b * 1000 - c * 100) / 10;
			e = (x - a * 10000 - b * 1000 - c * 100 - d * 10);
			if (a != 0)
			{
				fanxu = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
			}
			else if (b != 0)
			{
				fanxu = e * 1000 + d * 100 + c * 10 + b;
			}
			else if (c != 0)
			{
				fanxu = e * 100 + d * 10 + c;
			}
			else if (d != 0)
			{
				fanxu = e * 10 + d;
			}
			else if (e != 0)
			{
				fanxu = e;
			}
			else
			{
				fanxu = 0;
			}
			return (-fanxu);
		}
	}








}

