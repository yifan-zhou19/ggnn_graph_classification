package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int z;
		int m;
		int p;
		int q;
		int r;
		int n;
		int i = 1;
		int[] a = new int[12];
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			z = Integer.parseInt(tempVar3);
		}
		n = (x - 1) % 400;
		m = n % 100;
		q = n / 100;
		p = m % 4;
		r = m / 4;
		i += 5 * q;
		i += 5 * r;
		i += p;
		a[0] = 31;
		a[2] = 31;
		a[4] = 31;
		a[6] = 31;
		a[7] = 31;
		a[9] = 31;
		a[11] = 31;
		a[3] = 30;
		a[5] = 30;
		a[8] = 30;
		a[10] = 30;
		if (x % 400 == 0 || (x % 4 == 0 && x % 100 != 0))
		{
			a[1] = 29;
		}
		else
		{
			a[1] = 28;
		}
		for (k = 0;k < y - 1;k++)
		{
			i += a[k];
		}
		i += z - 1;
		i = i % 7;
		switch (i)
		{
		case 0:
			System.out.print("Sun.\n");
			break;
		case 1:
			System.out.print("Mon.\n");
			break;
		case 2:
			System.out.print("Tue.\n");
			break;
		case 3:
			System.out.print("Wed.\n");
			break;
		case 4:
			System.out.print("Thu.\n");
			break;
		case 5:
			System.out.print("Fri.\n");
			break;
		case 6:
			System.out.print("Sat.\n");
			break;
		}
		return 0;
	}
}

