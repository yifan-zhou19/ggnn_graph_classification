package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int m;
		int d;
		int i;
		int sum = 0;
		int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		a--;
		sum += a % 7 * 365 + a / 4 - a / 100 + a / 400;
		sum %= 7;
		a++;
		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
		{
			day[2]++;
		}
		for (i = 1;i < m;i++)
		{
			sum += day[i];
		}
		sum += d;
		sum %= 7;

		switch (sum)
		{
			case 1:
				System.out.print("Mon.");
				System.out.print("\n");
				break;
			case 2:
				System.out.print("Tue.");
				System.out.print("\n");
				break;
			case 3:
				System.out.print("Wed.");
				System.out.print("\n");
				break;
			case 4:
				System.out.print("Thu.");
				System.out.print("\n");
				break;
			case 5:
				System.out.print("Fri.");
				System.out.print("\n");
				break;
			case 6:
				System.out.print("Sat.");
				System.out.print("\n");
				break;
			case 0:
				System.out.print("Sun.");
				System.out.print("\n");
				break;
		}
		return 0;
	}

}

