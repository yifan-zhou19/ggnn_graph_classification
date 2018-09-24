package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int r;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		r = 0;
		i = 0;
		while (a > 0)
		{
			r = r * 10 + a % 10;
			i = i + !(a % 10);
			a = a / 10;
		}
		switch (i)
		{
		case 0:
			System.out.printf("%d\n",r);
			break;
		case 1:
			System.out.printf("0%d\n",r);
			break;
		case 2:
			System.out.printf("00%d\n",r);
			break;
		case 3:
			System.out.printf("000%d\n",r);
			break;
		case 4:
			System.out.printf("0000%d\n",r);
			break;
		}
		return 0;
	}


}

