package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int y;
		int r;
		int t = 0;
		int k;
		int i;
		int m;
		int j;
		int z;
		int yu;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			r = Integer.parseInt(tempVar3);
		}
		if (n > 10000)
		{
			n = n % 2000;
		}
		k = n / 100;
		m = n / 400;
		i = n / 4 - (k - m);
		if (y == 1)
		{
			t = 0;
		}
		else
		{
			for (j = 0;j < y - 1;j++)
			{
			t = t + a[j];
			}
		}
		z = 365 * (n - 1) + i + t + r;
		if (y == 2 && r == 29)
		{
			z = z - 1;
		}
		yu = z % 7;
		if (yu == 0)
		{
			System.out.print("Sun.");
		}
		else if (yu == 1)
		{
			System.out.print("Mon.");
		}
		else if (yu == 2)
		{
			System.out.print("Tue.");
		}
		else if (yu == 3)
		{
			System.out.print("Wed.");
		}
		else if (yu == 4)
		{
			System.out.print("Thu.");
		}
		else if (yu == 5)
		{
			System.out.print("Fri.");
		}
		else if (yu == 6)
		{
			System.out.print("Sat.");
		}


	}



}

