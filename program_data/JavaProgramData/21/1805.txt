package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int[] b = new int[300];
		int c;
		int d;
		int e;
		int f = 0;
		int h;
		int i;
		float g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (c = 0;c < a;c++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[c] = Integer.parseInt(tempVar2);
			}
		}
		for (c = 0;c < a;c++)
		{
			for (d = 0;d < a - c;d++)
			{
				if (b[d] > b[d + 1])
				{
					e = b[d];
					b[d] = b[d + 1];
					b[d + 1] = e;
				}
			}
		}
		for (i = 0;i <= a;i++)
		{
			f = f + b[i];
		}
		g = (float)f / a;
		if (Math.abs(b[1] - g) == Math.abs(b[a] - g))
		{
			System.out.printf("%d,%d",b[1],b[a]);
		}
		else if (Math.abs(b[1] - g) > Math.abs(b[a] - g))
		{
			System.out.printf("%d",b[1]);
		}
		else
		{
			System.out.printf("%d",b[a]);
		}
	}
}

