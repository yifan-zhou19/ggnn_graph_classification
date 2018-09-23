package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int k;
		int[] a = new int[4];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		j = n;
		if (j < 10)
		{
			k = 1;
		}
		if (j >= 10 && j < 100)
		{
			k = 2;
		}
		if (j >= 100 && j < 1000)
		{
			k = 3;
		}
		if (j >= 1000 && j < 10000)
		{
			k = 4;
		}
		a[3] = n / 1000;
		a[2] = (n - a[3] * 1000) / 100;
		a[1] = (n - a[3] * 1000 - a[2] * 100) / 10;
		a[0] = n - a[3] * 1000 - a[2] * 100 - a[1] * 10;
		switch (k)
		{
		case 1:
			System.out.printf("%d",a[0]);
			break;
		case 2:
			System.out.printf("%d%d",a[0],a[1]);
			break;
		case 3:
			System.out.printf("%d%d%d",a[0],a[1],a[2]);
			break;
		case 4:
			System.out.printf("%d%d%d%d",a[0],a[1],a[2],a[3]);
			break;
		}
		return 0;
	}
}

