package <missing>;

public class GlobalMembers
{
	public static int count(int x, int y)
	{
		if (x == 0 || y == 1)
		{
			return (1);
		}
		else if (x < y)
		{
			return (count(x, x));
		}
		else
		{
			return (count((x - y), y) + count(x, y - 1));
		}
	}



	public static void Main()
	{
		int[] m = new int[30];
		int[] n = new int[30];
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",count(m[i], n[i]));
		}
	}



}

