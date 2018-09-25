package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int place;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n >= 1000)
		{
			place = 4;
		}
		else if (n > 99)
		{
			place = 3;
		}
		else if (n > 9)
		{
			place = 2;
		}
		else
		{
			place = 1;
		}
		 a = n / 1000;
		 b = (int)(n - a * 1000) / 100;
		 c = (int)(n - a * 1000 - b * 100) / 10;
		 d = (int)n % 10;
		switch (place)
		{
		case 4:
			System.out.printf("%d%d%d%d\n",d,c,b,a);
			break;
		case 3:
			System.out.printf("%d%d%d\n",d,c,b);
			break;
		case 2:
			System.out.printf("%d%d\n",d,c);
			break;
		case 1:
			System.out.printf("%d\n",d);
			break;
		}
		return 0;
	}
}

