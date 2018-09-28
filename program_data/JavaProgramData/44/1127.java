package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int abs1;
		int zhengfu = 1;
		int ge = 0;
		int shi = 0;
		int bai = 0;
		int qian = 0;
		int wang = 0;
		int fanxu;
		if (Math.abs(num) == 0)
		{
			return 0;
		}
		else
		{
			if (num < 0)
			{
				zhengfu = -1;
			}
		}
		abs1 = Math.abs(num);
		if ((10000 <= abs1) && (abs1 <= 32767))
		{
			ge = abs1 % 10;
			shi = (abs1 / 10) % 10;
			bai = (abs1 / 100) % 10;
			qian = (abs1 / 1000) % 10;
			wang = (abs1 / 10000) % 10;
			fanxu = ge * 10000 + shi * 1000 + bai * 100 + qian * 10 + wang;
		}
		if ((1000 <= abs1) && (abs1 < 10000))
		{
			ge = abs1 % 10;
			shi = (abs1 / 10) % 10;
			bai = (abs1 / 100) % 10;
			qian = (abs1 / 1000) % 10;
			fanxu = ge * 1000 + shi * 100 + bai * 10 + qian;
		}
		if ((100 <= abs1) && (abs1 < 1000))
		{
			ge = abs1 % 10;
			shi = (abs1 / 10) % 10;
			bai = (abs1 / 100) % 10;
			fanxu = ge * 100 + shi * 10 + bai;
		}
		if ((10 <= abs1) && (abs1 < 100))
		{
			ge = abs1 % 10;
			shi = (abs1 / 10) % 10;
			fanxu = ge * 10 + shi;
		}
		if ((1 <= abs1) && (abs1 < 10))
		{
			ge = abs1 % 10;
			fanxu = ge;
		}
		if (zhengfu == 1)
		{
			return (fanxu);
		}
		else if (zhengfu == -1)
		{
			return ((-1) * fanxu);
		}

	}
	public static int Main()
	{
		int i;
		int a;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",reverse(a));
		}
	}

}

