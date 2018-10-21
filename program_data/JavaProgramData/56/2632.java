package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int t1;
		int t2;
		int t3;
		int t4;
		int t5;
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a / 10000 > 0)
		{
			w = 5;
		}
		else if (a / 1000 > 0)
		{
			w = 4;
		}
		else if (a / 100 > 0)
		{
			w = 3;
		}
		else if (a / 10 > 0)
		{
			w = 2;
		}
		else
		{
			w = 1;
		}
		t1 = a / 10000;
		t2 = a / 1000 - t1 * 10;
		t3 = a / 100 - t1 * 100 - t2 * 10;
		t4 = a / 10 - t1 * 1000 - t2 * 100 - t3 * 10;
		t5 = a / 1 - t1 * 10000 - t2 * 1000 - t3 * 100 - t4 * 10;

		switch (w)
		{
		case 5:
			System.out.printf("%d%d%d%d%d\n",t5,t4,t3,t2,t1);
			break;
		case 4:
			System.out.printf("%d%d%d%d\n",t5,t4,t3,t2);
			break;
		case 3:
			System.out.printf("%d%d%d\n",t5,t4,t3);
			break;
		case 2:
			System.out.printf("%d%d\n",t5,t4);
			break;
		case 1:
			System.out.printf("%d\n",t5);
			break;
		}
	}

}

