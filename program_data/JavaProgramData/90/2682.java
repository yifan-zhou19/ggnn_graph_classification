package <missing>;

public class GlobalMembers
{
	public static int digui(int x, int y)
	{
		if (x == 1 || y == 1)
		{
			return 1;
		}
		else if (x >= y)
		{
			return digui(x, y - 1) + digui(x - y, y);
		}
		else if (x < y)
		{
			return digui(x, y - 1);
		}
		else if (x == 0)
		{
			return 1;
		}
	}
	public static int Main()
	{
		int t;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			int M;
			int N;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				M = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				N = Integer.parseInt(tempVar3);
			}
			int s = 0;
			s = digui(M, N);
			System.out.printf("%d\n",s);
		}
		return 0;

	}





}

