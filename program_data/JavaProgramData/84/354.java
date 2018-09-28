package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m1;
		int m2;
		int m3;
		int a;
		int b;
		int c;
		int x;
		int y;
		int z;
		int w;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		for (i = 1;i <= w - 2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z = Integer.parseInt(tempVar4);
			}
			a = x;
			b = y;
			c = z;
			m1 = ((a + b + Math.abs(a - b)) / 2 + c + Math.abs((a + b + (a - b)) / 2 - c)) / 2;
			m3 = ((a + b - Math.abs(a - b)) / 2 + c - Math.abs((a + b - (a - b)) / 2 - c)) / 2;
			m2 = a + b + c - m1 - m3;
			x = m1;
			y = m2;
		}
		System.out.printf("%d\n",m1);
		System.out.printf("%d\n",m2);
	}


}

