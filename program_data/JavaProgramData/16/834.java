package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int z;
		int w;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 10000)
		{
			System.out.print("00001");
		}
		else
		{
			if (n > 999)
			{
				p = 4;
			}
			else
			{
				if (n > 99)
				{
					p = 3;
				}
			else
			{
				if (n > 9)
				{
					p = 2;
				}
				else
				{
					p = 1;
				}
			}
			}
		}
		x = n / 1000;
		y = (n - x * 1000) / 100;
		z = (n - x * 1000 - y * 100) / 10;
		w = n - x * 1000 - y * 100 - z * 10;
		switch (p)
		{
		case 4:
			System.out.printf("%d%d%d%d",w,z,y,x);
			break;
		case 3:
			System.out.printf("%d%d%d",w,z,y);
			break;
		case 2:
			System.out.printf("%d%d",w,z);
			break;
		case 1:
			System.out.printf("%d",w);
			break;
		}
	}

}

