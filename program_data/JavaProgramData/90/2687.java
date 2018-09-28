package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s = new int(int x,int y);
		int t;
		int[] m = new int[30];
		int[] n = new int[30];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",s(m[i], n[i]));
		}
		return 0;
	}

	public static int s(int x,int y)
	{
		int z;
		if (x == 0 || y == 0)
		{
			z = 1;
		}
		else if (x == 1 || y == 1)
		{
			z = 1;
		}
		else if (x < y)
		{
			z = s(x, y - 1);
		}
		else
		{
			z = s(x, y - 1) + s(x - y, y);
		}
		return z;
	}
}

