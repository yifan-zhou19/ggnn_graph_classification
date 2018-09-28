package <missing>;

public class GlobalMembers
{
	// ?????.cpp : Defines the entry point for the console application.
	//

	public static int fen(int x, int y)
	{
		int result = 0;
		if (y != 1)
		{
			result += fen(x, y - 1);
		}
		if (x - y >= 0 && y != 1)
		{
			result += fen(x - y, y);
		}
		if (y == 1)
		{
			result++;
			return result;
		}
		return result;
	}
	public static void Main(String[] args)
	{
		int i;
		int m;
		int n;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sum = Integer.parseInt(tempVar);
		}
		for (i = 0;i < sum;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",fen(m, n));
		}
	}


}

