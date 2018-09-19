package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int c;
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
		int[] d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
		{
			d[1]++;
		}
		int g = c;
		int i = 0;
		while (i >= b)
		{
			d[i]++;
		}
		for (i = 0;i < b - 1;i++)
		{
			g = g + d[i];
		}
		System.out.printf("%d",g);
	}

}

