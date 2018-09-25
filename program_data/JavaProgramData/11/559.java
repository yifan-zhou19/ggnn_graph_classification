package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int x;
		int y;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			z = Integer.parseInt(tempVar3);
		}
		int[] s = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int m = 0;
		int n = 0;
		for (m = 0;m < y - 1;m++)
		{
			n += s[m];
		}
		int D;
		if (((x % 4 == 0 && x % 100 != 0 || x % 400 == 0) && y != 1 && y != 2))
		{
			D = n + z + 1;
		}
		else
		{
			D = n + z;
		}
		System.out.printf("%d",D);
	}
}

