package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int x;
		int y;
		int z;
		int sum = 0;
		int p;
		int q;
		int w;
		int r;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			y = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			z = Integer.parseInt(tempVar6);
		}
		r = y - 1;
		p = x - 1;
		//???
		if (a == x)
		{
			if (b == y)
			{
			sum = z - c;
		System.out.printf("%d",sum);
			}
		else
		{
			for (r = r;r >= b;r--)
			{
			if ((r % 2 == 0) && (r > 7))
			{
		sum = sum + 31;
			}
		else if ((r % 2 == 1) && (r > 7))
		{
			sum = sum + 30;
		}
		else if ((r % 2 == 1) && (r < 8))
		{
			sum = sum + 31;
		}
		else if (((r % 2 == 0) && (r < 8)) && (r != 2))
		{
			sum = sum + 30;
		}
		else if ((r == 2) && ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)))
		{
			sum = sum + 29;
		}
		else if ((r == 2) && (x % 4 != 0 || (x % 100 == 0 && x % 400 != 0))) //??
		{
			sum = sum + 28;
		}
		sum = sum - c + z;
		System.out.printf("%d",sum);

			}
		}
		}
		//???
		else
		{
			k = a + 1;
			for (k = k;k <= p;k++) //??
			{
			if ((k % 4 == 0 && k % 100 != 0) || (k % 400 == 0))
			{
		   sum = sum + 366;
			}
		else
		{
			sum = sum + 365;
		}
			};

		for (q = 12;q >= b;q--)
		{
			if ((q % 2 == 0) && (q > 7))
			{
		sum = sum + 31;
			}
		else if ((q % 2 == 1) && (q > 7))
		{
			sum = sum + 30;
		}
		else if ((q % 2 == 1) && (q < 8))
		{
			sum = sum + 31;
		}
		else if (((q % 2 == 0) && (q < 8)) && (q != 2))
		{
			sum = sum + 30;
		}
		else if ((q == 2) && ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)))
		{
			sum = sum + 29;
		}
		else if ((q == 2) && (a % 4 != 0 || (a % 100 == 0 && a % 400 != 0))) //??
		{
			sum = sum + 28;
		}
		}
		sum = sum - c; //????
		for (w = 1;w < y;w++)
		{
		if ((w % 2 == 0) && (w > 7))
		{
		sum = sum + 31;
		}
		else if ((w % 2 == 1) && (w > 7))
		{
			sum = sum + 30;
		}
		else if ((w % 2 == 1) && (w < 8))
		{
			sum = sum + 31;
		}
		else if (((w % 2 == 0) && (w < 8)) && (w != 2))
		{
			sum = sum + 30;
		}
		else if ((w == 2) && ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)))
		{
			sum = sum + 29;
		}
		else if ((w == 2) && (x % 4 != 0 || (x % 100 == 0 && x % 400 != 0))) //??
		{
			sum = sum + 28;
		}
		}
		sum = sum + z;
		System.out.printf("%d",sum);
		}
		return 0;
	}



}

